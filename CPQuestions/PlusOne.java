package CPQuestions;
// https://leetcode.com/problems/add-binary/description/
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        long sum=0 ;
        for (int i=0;i<digits.length;i++) {
            sum+=digits[i]*Math.pow(10,digits.length-i-1) ;
        }
        sum=sum+1 ;
        String str=String.valueOf(sum);
        char[] ans=str.toCharArray() ;

        int[] result=new int[ans.length];
        for (int i=0;i<ans.length;i++) {
            result[i]=Character.getNumericValue(ans[i]) ;
        }
        return result ;
    }

    public static int[] plusOne1(int[] digits) {
        int n=digits.length ;
        for (int i=n-1;i>=0;i--) {
            if (digits[i]!=9) {
                digits[i]++ ;
                break ;
            }else{
                digits[i]=0 ;
            }
        }

        if (digits[0]==0) {
            int res[]=new int[n+1] ;
            res[0]=1 ;
            return res ;
        }
        return digits ;
    }

    public static void main (String[] args ) {
         // int[] arr ={9,8,7,6,5,4,3,2,1,0};
        int[] arr={9,9,9,9} ;
        // int[] arr={6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3} ;

        for(int i:plusOne(arr)) {
            System.out.print(i+" ");
        }

    }
}
