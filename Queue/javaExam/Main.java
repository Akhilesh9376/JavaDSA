package Queue.javaExam;

public class Main {
    public static boolean isSubsequence(String s, String t) {
        int arr[]=new int[s.length()];
        for(int i=0;i<s.length();i++) {
          arr[i] = t.indexOf(String.valueOf(s.charAt(i)) ) ;
        }
        for(int i=0;i<arr.length-1;i++) {
          if (arr[i]==-1) {
            return false ;
          }
          if (arr[i]>arr[i+1]) {
            return false ;
          }
        }
        for(int i:arr) {
            System.out.println(i+" ");
        }
        return true ;
      }
    public static void main(String[] args) {
        System.out.println(isSubsequence("b", "c"));
    }
}
