package BinaryTree;

import java.util.ArrayList;


public class Diameter {
    public static class TreeNode{
        int data ;
        TreeNode left ;
        TreeNode right ;

        TreeNode(int data ) {
            this.data=data ;
            this.left=null ;
            this.right=null ;
        }
    }

    public static class BinaryTree {
        static int idx=-1 ;
        public static TreeNode buildTree(int node[]) {
            idx++ ;

            if (node[idx]== -1 ) {
                return null ;
            }
        

            TreeNode newNode =new TreeNode(node[idx]);
            newNode.left=buildTree(node);
            newNode.right=buildTree(node);

            return newNode ;
        }
    }
    // Finding the Height of the Binary Tree
    public static int height(TreeNode root) {
        if (root==null) {
            return 0 ;
        }

        int leftHeight=height(root.left);
        int rightHeight=height(root.right) ;

        return Math.max(leftHeight, rightHeight)+1 ;
    }
    // Finding the Diameter of the Binary Tree 
// APPROACH: 1 

    public static int diameter(TreeNode root ) {
        if (root==null) {
            return 0 ;
        }

        // calling for the left subtree 
        int lDiameter =diameter(root.left) ;
        int lHeight=height(root.left) ;

        // calling for the right subtree 

        int rDiameter =diameter(root.right) ;
        int rHeight =height(root.right); 

        int SelfDiameter=lHeight+rHeight+1 ;

        return Math.max(SelfDiameter, Math.max(lDiameter, rDiameter)) ;
    }

    // APPROACH : 2 

    static class Info {
        int diameter ;
        int height ;
        Info(int diameter,int height) {
            this.diameter=diameter ;
            this.height=height ;
        }
    }

    public static Info diameter2(TreeNode root) {
        if (root==null) {
            return new Info(0, 0) ; 
        }
        Info leftInfo=diameter2(root.left);

        Info rightInfo=diameter2(root.right);

        int diam=Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.height+rightInfo.height+1) ;
        int ht =Math.max(leftInfo.height, rightInfo.height) +1 ;

        return new Info(diam, ht) ;

    }

    // Kth Level of Tree 
    public static void kthLevel(TreeNode root,int level ,int k) {
        if (root==null) {
            return ;
        }
        if (level==k) {
            System.out.print(root.data +" ") ;
            return ;
        }
        kthLevel(root.left, level+1, k);
        kthLevel(root.right, level+1, k);
    }


    // Lowest Common Ancestor 
    public static boolean getPath(TreeNode root,int n,ArrayList<Integer> path) {
        if (root == null) {
            return false ;
        }
        path.add(root.data);

        boolean foundLeft=getPath(root.left, n, path);
        boolean foundRight=getPath(root.right, n, path);

        if (foundLeft || foundRight) {
            return true ;
        }

        path.remove(path.size()-1);
        return false ;

    }
    public static TreeNode lca(TreeNode root,int n1,int n2) {
        ArrayList<Integer> path1=new ArrayList<>();
        ArrayList<Integer> path2=new ArrayList<>();

        getPath(root,n1,path1);
        getPath(root,n2,path2);
        int i=0 ;
        for( ;i<path1.size() && i<path2.size();i++) {
            if (path1.get(i)!=path2.get(i)) {
                break ;
            }
        } 
        return new TreeNode(path1.get(i-1));
    }

    // Writing the Code for the Second Approach 
    public static TreeNode lca2(TreeNode root,int n1,int n2) {
        if (root==null) {
            return null ;
        }
        if (root.data==n1 || root.data==n2) {
            return root ;
        }

        TreeNode leftLca=lca2(root.left, n1, n2);
        TreeNode rightLca=lca2(root.right,n1,n2);
        // LeftLCA=val && rightLCA=null
        if (rightLca==null) {
            return leftLca ;
        }
        if (leftLca==null) {
            return rightLca ;
        }
        return root ;
    }

    public static int lcaDist(TreeNode root ,int n) {
        if (root==null) {
            return -1 ;
        }
        if (root.data==n) {
            return 0;
        }

        int leftDist=lcaDist(root.left, n);
        int rightDist=lcaDist(root.right, n);

        if (leftDist==-1 && rightDist==-1 ) {
            return -1 ;
        }else if (leftDist==-1 ) {
            return rightDist+1 ;
        }else {
            return leftDist+1 ;
        }
    }
    // Minimum Distance between two Nodes 
    public static int minDistance(TreeNode root,int n1,int n2) {
        TreeNode lca=lca2(root, n1, n2); 

        int dist1=lcaDist(lca,n1);
        int dist2=lcaDist(lca,n2);

        return dist1+dist2 ;


    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);

        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);

        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);

        int n1=4,n2=7 ;
        System.out.println(minDistance(root,n1,n2));
    }
}
