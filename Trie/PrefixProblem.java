package Trie;

public class PrefixProblem {
    static class Node {
        Node children[]=new Node[26] ; 
        boolean endOfWord=false ;
        int frequency ;

        public Node(){
            for(int i=0;i<26;i++) {
                children[i]=null ;
            }
            frequency=1 ;
        }
    }
    // Inserting the Element 
    public static void insert(String word) {
        Node curr=root ;
        for(int i=0;i<word.length();i++) {
            int idx=word.charAt(i)-'a' ;
            if (curr.children[idx]==null) {
                curr.children[idx]=new Node() ;
            }else {
                curr.children[idx].frequency++ ;
            }

            curr=curr.children[idx] ;
        }
        curr.endOfWord=true ;
    }

    public static void findPrefix(Node root ,String ans) {
        if (root == null) {
            return ;
        }
        if (root.frequency==1) {
            System.out.print(ans+"  ");
            return ;
        }
        for(int level=0;level<root.children.length;level++) {
            if (root.children!=null) {
                findPrefix(root.children[level], ans+(char)(level+'a'));
            }
        }
    }
    public static Node root =new Node() ;
    public static void main(String[] args) {
        String[] arr={"zebra","dog","duck","dove"};

        for(int i=0;i<arr.length;i++) {
            insert(arr[i]);
        }
        // String ans="";
        // ans+=(char)(1+'a');
        // System.out.println(ans);
        root.frequency = -1 ;

        findPrefix(root, "");
    }
}
