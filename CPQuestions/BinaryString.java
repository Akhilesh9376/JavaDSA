package CPQuestions;

public class BinaryString {
    // program for converting the binary to decimal
    public static int binaryToDecimal(int n) {
        int decimal=0,power=0;
        while(n>0) {
            int rem=n%10;
            decimal+=rem*Math.pow(2, power);
            n=n/10;
            power++ ;
        }
        return decimal ;
    }
    // program for converting the decimal to binary 
    public static int decimalToBinary(int n) {
        int binary=0,power=0 ;
        while(n>0) {
            int rem=n%2 ;
            binary+=rem*Math.pow(10, power);
            n=n/2 ;
            power++ ;
        }
        return binary ;
    }

    public static String addBinary(String a ,String b ) {
        int num1=binaryToDecimal(Integer.valueOf(a)) ;
        int num2=binaryToDecimal(Integer.valueOf(b)) ;
        int sum=decimalToBinary(num1+num2);
        return String.valueOf(sum);

    }

    public static void main(String[] args ) {
        System.out.println(addBinary("11", "1"));
    }
}
