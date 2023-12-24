package CPQuestions;

import java.util.ArrayList;

public class SumOfAlterDigit {
    public static int alterSum(int n) {
        char[] ch=(String.valueOf(n)).toCharArray() ;
        int sum=0 ;
        for (int i=0;i<ch.length;i++) {
            if (i%2==0)
                sum+=Character.getNumericValue(ch[i]);
            else
                sum-=Character.getNumericValue(ch[i]) ;
        }
        return sum ;

    }
    public static void main(String[] args ) {
   int result= alterSum(100);
    System.out.println(result);
       
    }
}
