package BinaryTree;
import java.util.* ;
public class LevelOrder {
    static class TreeNode {
        int data ;
        TreeNode left ;
        TreeNode right ;

        public TreeNode(int data ) {
            this.data =data ;
        }
    }
    public static List<List<Integer>> level(TreeNode root ) {
        List<List<Integer>> answer =new ArrayList<>() ;
        Queue<TreeNode> q=new LinkedList<>() ;
        q.add(root);
        if(root==null) {
            return answer ;
        }

        while(!q.isEmpty()) {
            int size=q.size() ;
            List<Integer> list=new ArrayList<>() ;
            for(int i=0;i<size;i++) {
                TreeNode node = q.remove() ;
                list.add(node.data);

                if((node.left!=null)) {
                    q.add(node.left);
                }
                if(node.right!=null) {
                    q.add((node.right)) ;
                }
            }
            answer.add(list);
        }

        return answer ;
    }
    public static void main(String[] args) {
        
    }
}
