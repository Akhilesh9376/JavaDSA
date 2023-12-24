package BitWiseOPerator;

import java.util.HashSet;
import java.util.Set;

/*
 * Bitwise OPerator
 * Binary AND
 * Binary OR
 * Binary XOR
 * Binary One's Complement
 * Binary Left Shift 
 * Binary Right Shift 
 */
public class Main {
    public static void evenOrOdd(int n) {
        int bitMask =1 ;
        if ((n & bitMask)==0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number ");
        }
    }
    // getting the ith bit of the binary number 
    public static int getIthBit(int n,int i ) {
        int bitMask=1<<i ;
        if ((n&bitMask)==0){
            return 0 ;
        }else{
            return 1 ;
        }
    }
    
    public static void main (String args[]) {
        Solution s=new Solution();
        int[] nums = {0,0,1,1,1,2,2,3,3,4} ;
        System.out.println(s.removeDuplicates(nums));
    }
    
}


class Solution {
    public int removeDuplicates(int[] nums) {
        int unNum[]=new int[nums.length];
        int count=0 ;
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1]){
                unNum[count]=nums[i] ;
                count++ ;
            }
        }
        return count ;
    }
}
