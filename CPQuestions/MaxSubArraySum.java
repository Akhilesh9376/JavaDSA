package CPQuestions;

public class MaxSubArraySum {
    public static int sum(int[] nums) {
        int ms =Integer.MIN_VALUE ;
        int cs =0 ;
        for (int i=0;i<nums.length;i++) {
            cs=cs+nums[i] ;
            if (cs<0) {
                cs=0 ;
            }
            ms=Math.max(cs,ms) ;
        }
        return ms ;
    }
    public static void main (String args []) {
    int arr[]={-1} ;
    System.out.println(sum(arr));
    }
}
