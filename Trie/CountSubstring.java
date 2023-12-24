package Trie;

public class CountSubstring {
    static class Node {
        Node[] children=new Node[26] ;
        boolean endOfWord=false ;
        public Node() {
            for(int i=0;i<26;i++) {
                children[i]=null ;
            }
        }
    }
    public static Node root =new Node() ;
    // Method for the inserting the element in the trie 
    public static void insert (String key) {
        Node curr=root ;
        for(int i=0;i<key.length();i++) {
            int idx = key.charAt(i) - 'a' ;
            if (curr.children[idx]==null) {
                curr.children[idx]=new Node() ;
            }
            curr=curr.children[idx] ;
        }
        curr.endOfWord=true ;
    }

    // Method for Counting the Node of the trie 
    public static int countNode(Node root ) {
        if (root==null) {
            return 0 ;
        }
        int count = 0 ;
        for(int i=0;i<26;i++) {
            if (root.children[i]!=null) {
                count+=countNode(root.children[i]) ;
            }
        }
        return count+1 ;
    }
    public static void main(String[] args) {
        String s="ababa" ;
        // sufix -> insert int trie 
        for(int i=0;i<s.length();i++) {
            String suffix=s.substring(i) ;
            insert(suffix) ;
        }
        System.out.println(countNode(root));
    }
}
