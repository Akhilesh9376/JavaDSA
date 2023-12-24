package CPQuestions;
import java.util.Arrays;
public class SingleNumber {
    public static int single(int[] nums ) {
        
        int singleElement=0 ;
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++) {
            for (int j=i+1;j<nums.length;j++) {
                // https://leetcode.com/problems/single-number/
            }
            singleElement=nums[i] ;
        }
        return singleElement ;
    }
    public static void main (String args[]) {
        int arr[]={1,2,1,3,4,2,4} ;
        System.out.println(single(arr)); ;

    }
}
