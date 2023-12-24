package CPQuestions;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] arr=s.trim().split(" ") ;
        int n=arr[arr.length-1].length() ;
        return n ;
    }
    public static void main (String args[]) {
       System.out.println(lengthOfLastWord("   fly me   to   the moon  ")) ;
    }
}
