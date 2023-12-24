package CPQuestions;

import java.util.Map;
import java.util.TreeMap;
/*
 *  I             1
 *  V             5
    X            10
    L            50
    C            100
    D            500
    M            1000
 */
public class Roman {
    public static int romanToInt(String s) { 
        int number[]={1,5,10,50,100,500,1000};
        char roman[]={'I','V','X','L','C','D','M'};
       

        int digit =0 ;

       for (int i=s.length()-1;i>=0;i--) {
            for (int j=0;j<roman.length;j++) {
                if (s.charAt(i)==roman[j]){
                    digit=digit+number[j];
                }
            }
       }

        return digit;

    }
    public static void main(String[] args) {
      System.out.println(romanToInt("LVIII"));
    }
}
