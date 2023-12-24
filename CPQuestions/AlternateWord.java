package CPQuestions;

public class AlternateWord {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder("") ;
        int i=0 ;
        int j=0 ;
        while(i<word1.length() && j<word2.length()) {
            String temp=Character.toString(word1.charAt(i)) + Character.toString(word2.charAt(j));
            sb.append(temp) ;
            i++ ;
            j++ ;
        }
        while(i<word1.length()) {
            sb.append(word1.charAt(i));
            i++ ;
        }
        while(j<word2.length()) {
            sb.append(word2.charAt(j)) ;
            j++ ;
        }
   
        return sb.toString() ;
       }
       public static void main(String[] args) {
        
       }
}
