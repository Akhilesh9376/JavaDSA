package Trie;

public class LongestWordWithAllPrefix {
    static class Node {
        Node[] children=new Node[26] ;
        boolean endOfWord=false ;
        // Creating the Constructor for the word 
        public Node() {
            for(int i=0;i<26;i++) {
                children[i]=null ;
            }
        }
    }
    public static Node root =new Node() ;

    // inserting the word in trie 
    public static void insert(String key) {
        Node curr=root ;
        for(int i=0;i<key.length();i++) {
            int idx=key.charAt(i)-'a' ;
            if (curr.children[idx]==null ) {
                curr.children[idx]=new Node() ;
            }
            curr=curr.children[idx] ;
        } 
        curr.endOfWord=true ;
    }
    public static String ans  ="";
    public static void longestWord(Node root ,StringBuilder temp  ) {
        if (root==null) {
            return ;
        }

        for(int i=0;i<26;i++) {
            if (root.children[i]!=null && root.children[i].endOfWord==true) {
                char ch=(char)(i+'a') ;
                temp.append(ch) ;
                if (temp.length()>ans.length()) {
                    ans=temp.toString() ;
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1) ; // removing the element backtracing 
             }
        }
    }
    public static void main(String[] args) {
        String[] word={"a","banana","app","appl","ap","apply","apple"}; 
        for(int i=0;i<word.length;i++) {
            insert(word[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
