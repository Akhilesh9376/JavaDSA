package BinarySearchTree;

import java.util.ArrayList;

public class InsertElement {
    static class Node {
        int val ;
        Node left ;
        Node right ;
        Node(int val ) {
            this.val=val ;
        }
    }

    // Function for the insert of 
    public static Node insert(Node root ,int val ) {
        if (root==null) {
            root=new Node(val);
            return root ;
        }

        if (root.val > val) {
            root.left=insert(root.left, val) ;
        }else {
            root.right=insert(root.right, val);
        }

        return root ;
    }
    // Search an Element in the BST 
    public static boolean searchElement (Node root ,int key ) {
        if (root==null) {
            return false ;
        }
        if (root.val==key) {
            return true ;
        }

        if (root.val > key ) {
            return searchElement(root.left, key);
        }else {
            return searchElement(root.right, key);
        }
    }
    // InOrder Traversal 
    public static void inorder(Node root) {
        if (root==null) {
            return ;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    // Delete An Element from the Binary Search Tree 
    public static Node delete(Node root,int val) {
        if (root.val > val ) {
            root.right= delete(root.left, val);
        }else if(root.val < val) {
            root.left=delete(root.left, val) ;
        }else {
            // Element found in this case and we gonna delete the node 
            // case 1 : if the element is the leaf node 
            if (root.left==null && root.right==null) {
                return null ;
            }

            // Case 2: - Single Child 
            if (root.left==null) {
                return root.right ;
            }else if (root.right==null) {
                return root.left ;
            }

            // Case 3:- 
            Node IS = findInorderSuccessor(root.right);
            root.val=IS.val ;
            root.right= delete(root.right, IS.val) ;
        }
        return root ;
    }
    public static Node findInorderSuccessor(Node root ) {
        while(root.left!=null) {
            root=root.left ;
        }
        return root ; 
    }
    public static String defangIPaddr(String address) {
        String[] arr=address.split("\\.");
        // StringBuilder sb = new StringBuilder("");
        return String.join("[.]",arr);
    }

    // validate Binary Search Tree 
    public static boolean isValidate(Node root ,Node min,Node max) {
        if (root==null) {
            return true ;
        }
        if (min!=null && root.val<=min.val) {
            return false ;
        }else if (max!=null && root.val >= max.val ) {
            return false ;
        }
        return isValidate(root.left, min, root ) && isValidate(root.right, root, max) ;
    }
    // Mirror of Binary Search Tree 
    public static Node createMirror(Node root) {
        if (root==null ) {
            return null ;
        }

        Node leftSubtree=createMirror(root.left) ;
        Node rightSubtree=createMirror(root.right);

        root.left=rightSubtree ;
        root.right=leftSubtree ;

        return root ;
    }

    // Creating the Balanced binary Search tree from the node of the tree 
    // Finding the InOrder traversal of the tree 
    public static void inOrder(Node root ,ArrayList<Integer> list ) {
        if (root == null) {
            return ;
        }

        // traversing the left subtree 
        inOrder(root.left, list);
        // Adding the element of the tree 
        list.add(root.val) ;
        // traversing the right subtree 
        inOrder(root.right, list);

    }

    // balancing the binary search tree 
    public static Node balance(ArrayList<Integer> list,int st,int end ) {
        if (st> end ) {
            return null ;
        }
        int mid =(st+end)/2 ;
        Node root =new Node(list.get(mid)) ;
        root.left=balance(list, st, mid-1) ;
        root.right=balance(list, mid+1, end) ;

        return root ;
    }

    public static Node balanceBST(Node root ) {
        ArrayList<Integer> list = new ArrayList<>() ;
        inOrder(root, list);
        
        return balance(list, 0, list.size()-1) ;
    }

    // Size of Largest Binary Search Tree 

    static class Info {
        boolean isBST ;
        int size ;
        int min ;
        int max; 

        public Info(boolean isBST,int size,int min ,int max) {
            this.isBST=isBST ;
            this.size=size ;
            this.min = min ;
            this.max = max ;
        }
    }
    public static int maxBST=0 ;
    public static Info largestBST (Node root) { 
        if (root==null) {
            return new Info(true, 0, Integer.MIN_VALUE, Integer.MAX_VALUE) ;
        }
        Info leftInfo=largestBST(root.left);
        Info rightInfo=largestBST(root.right) ;

        int size=leftInfo.size+rightInfo.size +1 ;
        int min = Math.min(root.val, Math.min(leftInfo.min,rightInfo.min)) ;
        int max = Math.max(root.val, Math.max(leftInfo.max, rightInfo.max)) ; 

        if (root.val <= leftInfo.max || root.val >= rightInfo.min) {
            return new Info(false, size, min, max) ;

        }

        if (leftInfo.isBST && rightInfo.isBST) {
            maxBST=Math.max(size,maxBST) ;
            return new Info(true, size, min, max) ;
        }

        return new Info(false, size, min, max) ;
    }


    // Code for Creating A Binary Search Tree  
    public static Node createBST(ArrayList<Integer> list,int st,int end ) {
        if (st>end) {
            return null ;
        }

        int mid=(st+end) / 2 ;
        Node root =new Node(list.get(mid)) ;
        root.left=createBST(list, st,mid-1) ;
        root.right=createBST(list, mid+1, end) ;

        return root ;

    }
    public static Node mergeBST(Node root1,Node root2) {
        // Step 1 : InOreder For the first root1
        ArrayList<Integer> list1 =new ArrayList<>();
        inOrder(root1, list1);

        // Step 2 : 
        ArrayList<Integer> list2=new ArrayList<>() ;
        inOrder(root2, list2);

        // Sorting the two ArrayList and adding in the new ArrayList

        int i=0 ;
        int j=0 ;
        ArrayList<Integer> finalList=new ArrayList<>() ;

        while(i<list1.size() && j<list2.size()) {
            if (list1.get(i)<=list2.get(j)) {
                finalList.add(list1.get(i)) ;
                i++ ;
            }else {
                finalList.add(list2.get(j));
                j++ ;
            }
        }

        while(i<list1.size()) {
            finalList.add(list1.get(i));
            i++ ;
        }
        while(j<list2.size()) {
            finalList.add(list2.get(j)) ;
            j++ ;
        }

        return createBST(finalList,0,finalList.size()-1); 
        
    }
    public static void main(String[] args) {
        // Node root = null ;
        // int[] values ={5,1,3,4,2,7};
        // for(int i:values) {
        //     root=insert(root, i);
        // }
        // inorder(root); 
        //  System.out.println(defangIPaddr("1.1.1.1"));
      

    }
}
