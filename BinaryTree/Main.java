package BinaryTree;

import java.util.*;

public class Main {
    // creating the binary tree 
    static class Node {
        int data ;
        Node left ;
        Node right ;
        Node(int data ) {
            this.data=data ;
            this.left=null ;
            this.right=null ;
        }
    }
    static class BinaryTree {
        static int idx=-1 ;
        public static Node buildTree (int node[]  ) {
            idx++ ;

            if (node[idx]==-1) {
                return null ;
            }

            Node newNode=new Node(node[idx]);
            newNode.left=buildTree(node) ;
            newNode.right=buildTree(node);

            return newNode ;
        }

        // PreOrder Travels in Binary Tree 
        public static void prOrder(Node root) { // Time Complexity is O(n)
            /*
             * 1. Root 
             * 2. Left SubTree 
             * 3. Right SubTree 
             */
            if (root== null) {
                // System.out.print(-1+" ");
                return ;
            }
            System.out.print(root.data+" ");
            prOrder(root.left);  // Printing the Left SubTree 
            prOrder(root.right); // Printing the right SubTree 
        }

        // InOrder Travesal 
        public static void inOrder(Node root) {
            /*
             * 1. Left SubTree
             * 2. Root 
             * 3. Right SubTree 
             */

             // Base Case 
             if (root == null) {
                return ;
             }
            inOrder(root.left);   // left SubTree 
            System.out.print(root.data+" "); // printing the root 
            inOrder(root.right);  // printing the right subtree 
        }

        // Post Order Traversal 
        public static void postOrder(Node root ) {
            /*
             * 1. Left SubTree 
             * 2. Right SubTree 
             * 3. Root 
             */
            if (root==null) {
                return ;
            }
            // calling for the left subtree 
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        //  Level Order 
        public static void levelOrder(Node root) {
            if (root==null) {
                return ;
            }
            Queue<Node> q=new LinkedList<>() ;
            q.add(root) ;
            q.add(null) ;

            while(!q.isEmpty()) {
                Node currNode=q.remove() ;
                if (currNode==null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break ;
                    }else {
                        q.add(null) ;
                    }
                }else {
                    System.out.print(currNode.data+" ");

                    if (currNode.left!=null) {
                        q.add(currNode.left) ;
                    }

                    if (currNode.right!=null) {
                        q.add(currNode.right) ;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        String name[]={"A","5"};
    System.out.println(isNum);
        // int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree tree =new BinaryTree() ;
        // Node root =tree.buildTree(nodes);
        // System.out.println(root.data);
        /*       
        tree.prOrder(root); 
        System.out.println();
        tree.inOrder(root);
        System.out.println();
        tree.postOrder(root);
         */

    //   tree.levelOrder(root);
    

    }
}
