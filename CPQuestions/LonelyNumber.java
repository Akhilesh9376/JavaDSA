package CPQuestions;
import java.util.*;
public class LonelyNumber {
    // helper function 
    public static int count(int arr[],int n) {
        int ans =0 ;
        for (int i=0;i<arr.length;i++) {
            if (arr[i]==n) {
                ans++ ;
            }
        }
        return ans ;
    }
    public static List<Integer> findLonely(int[] nums) {
        List<Integer> list=new ArrayList<>() ;
        
        for (int i=0;i<nums.length;i++) {
            int start=i ;
            int end=nums.length-1 ;
            while(count(nums, nums[i])==1 && nums[start]!=nums[end]) {
                    
            }
        }
        return list ;

    }
    public static void main (String[] args ) {

    }
}
