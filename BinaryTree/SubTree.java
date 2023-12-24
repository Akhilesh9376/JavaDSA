package BinaryTree ;
public class SubTree {
    static class TreeNode {
        int val ;
        TreeNode left ;
        TreeNode right ;
        TreeNode (int val) {
            this.val=val ;
        }
        TreeNode(int val ,TreeNode left,TreeNode right ) {
            this.val=val ;
            this.left=left ;
            this.right=right ;
        }
    }
    public static boolean isIdentical(TreeNode root,TreeNode subRoot) {
        if (root==null && subRoot==null) {
            return true ;
        }else if (root==null || subRoot==null || root.val!=subRoot.val) {
            return false ;
        }

        if (!isIdentical(root.left, subRoot.left)) {
            return false ;
        }

        if (!isIdentical(root.right, subRoot.right)) {
            return false ;
        }
        return true ;

    }
    public static boolean isSubtree(TreeNode root ,TreeNode subRoot) {
            if (root==null) {
                return false ;
            }

            if (root.val==subRoot.val) {
                if (isIdentical(root,subRoot)) {
                    return true ;
                }
            }

            boolean left=isSubtree(root.left, subRoot);
            boolean right=isSubtree(root.right, subRoot);

            return left || right ;
    }
    public static void main (String[] args ) {

    } 
}
