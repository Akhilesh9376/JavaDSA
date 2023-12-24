// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class HelloWorld {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count =0 ;
        int mx=0 ;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==1) {
                count++ ;
                mx=Math.max(count,mx) ;
            }else{
                count=0;
            }
        }
        return mx ;
    }
       public static void main (String[] args ) {
           int[] nums={1,0,1,1,0,1} ;
           System.out.println(findMaxConsecutiveOnes(nums));
       } 

}