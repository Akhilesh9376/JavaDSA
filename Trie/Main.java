package Trie;

public class Main {
    static class Node {
        Node children[]=new Node[26] ;
        boolean endOfWord =false ;

        Node () {
            for(int i=0;i<26;i++) {
                children[i]=null ;
            }
        }
    }
    public static Node root =new Node() ; 

    // Inserting the Element in the trie 
    public static void insert(String word) { // Time Complexity O(Length of Largest Word)
        Node curr= root ;
        for(int level=0 ;level<word.length();level++) {
            int idx=word.charAt(level)-'a' ;
            
            if (curr.children[idx]==null) {
                curr.children[idx]=new Node() ;
            }
            curr=curr.children[idx] ;
        }
        curr.endOfWord=true ;
    }

    // Search the element in the trie 
    public static boolean search (String key) {
        Node curr=root ;
        for(int level=0;level<key.length();level++) {
            int idx=key.charAt(level)-'a' ;
            if (curr.children[idx]==null) {
                return false ;
            }
            curr=curr.children[idx] ;
        }
        return curr.endOfWord==true ;
    }

    // Question of Word Break 
    public static boolean wordBreak(String key) {
        if (key.length()==0) {
            return true ;
        }
        for(int i=1;i<=key.length();i++) {
         // substring(0,1) 
            String firstPart=key.substring(0, i) ; 
            String secondPart=key.substring(i) ;
            if (search(firstPart) && wordBreak(secondPart)) {
                return true ;
            }
           
        }
        return false ;
    }
    // method for start with prefix 
    public static boolean isStartWith(String prefix ) { // O(L)
        Node curr =root ; 
        
        for(int i=0;i<prefix.length();i++) {
            int idx=prefix.charAt(i)-'a' ;
            if (curr.children[idx]==null) {
                return false ;
            }
            curr=curr.children[idx] ;
        }
        return true ;
    }
    public static void main(String[] args) {
        // String[] words={"the","a","there","their","any","thee"};

        // for(int i=0;i<words.length;i++) {
        //     insert(words[i]);
        // }

        // System.out.println(search("any"));
        // System.out.println(search("an"));

        // String[] arr={"i","like","sam","samsung","mobile","ice"};
        String[] arr={"b"};

        for(int i=0;i<arr.length;i++) {
            insert(arr[i]);
        }

        String key= "a" ;
        System.out.println(wordBreak(key));
    }
}
