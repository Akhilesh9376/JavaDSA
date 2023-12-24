package String;

import java.util.Scanner;

public class Main {
  // making each letter of word in the capital letter 
    public static String toUpperFirst(String str) {
      StringBuilder sb =new StringBuilder("");
      sb.append(Character.toUpperCase(str.charAt(0)));
      for (int i=1;i<str.length();i++) {
        if (str.charAt(i)==' ' && i<(str.length()-1)) {
            sb.append(str.charAt(i)) ;
            i++ ;
            sb.append(Character.toUpperCase(str.charAt(i))) ;
        }else{
          sb.append(str.charAt(i));
        }

      }
      return sb.toString() ;
    }
    
    // String word Compression 
    public static String wordCompress(String str){
      String compStr="" ;
      for (int i=0;i<str.length();i++) {
          Integer count =1 ;
          while(i<(str.length()-1) && str.charAt(i)==str.charAt(i+1)) {
            count++ ;
            i++ ;
          }
          compStr+=str.charAt(i) ;
          if (count>1) {
            compStr+=count.toString() ;
          }
      }
      return compStr;
    }
    // String compression by StringBuilder ;
    public static String compressWord(String str) {
      StringBuilder sb = new StringBuilder("") ;
      for (int i=0;i<str.length();i++) {
        Integer count=1 ;
        while(i<(str.length()-1) && str.charAt(i)==str.charAt(i+1)) {
          count++ ;
          i++ ;
        }
        sb.append(str.charAt(i)) ;
        if (count>1) {
          sb.append(count.toString()) ;
        }
      }
      return sb.toString() ;
    }
    public static void main(String args[]) {
        // StringBuilder sb =new StringBuilder("");
        // Scanner sc=new Scanner(System.in) ;
        // for (int i=0;i<=6;i++){
        //   sb.append(sc.next());
        // }
        // System.out.println(sb+" ");
        // String name =toUpperFirst("my name is akhilesh yadav !");
        // System.out.println(name);

        /*
        String compressWord=wordCompress("aaabbbcccd") ;
        System.out.println(compressWord);
        */
        String compressWord=wordCompress("aaabbbcccdddzzzzzz") ;
        System.out.println(compressWord);


    }
}
