package CPQuestions;

public class StringMultiply {
    public static String multiply(String num1,String num2) {
        String str="" ;
        int quot=0 ;
        for (int i=num1.length()-1,j=num2.length()-1;i>=0;i--,j--) {
            int temp=Character.getNumericValue(num1.charAt(i))*Character.getNumericValue(num2.charAt(j))+quot;
            
            quot=temp/10;
            if (temp>10) {
                int rema=temp%10;
                str=rema+str  ;
            }else{
                str=temp+str  ;
            }
            
        } 
        return str ;
    }
    public static void main (String[] args ) {
        System.out.println(multiply("9", "3"));
    }
}
