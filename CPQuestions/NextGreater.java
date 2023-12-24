package CPQuestions;

import java.util.Stack;

public class NextGreater {
    public static int[] next(int nums1[],int nums[]) {
        Stack<Integer> s=new Stack<>() ;
        int ans[]=new int[nums.length];

        int n=nums.length ;
        for(int i=n-1;i>=0;i--) {
            while(!s.isEmpty() && nums[i]>s.peek()) {
                s.pop() ;
            }
            if (s.isEmpty()) {
                ans[i]=-1 ;
            }else {
                ans[i]=s.peek() ;
            }
            s.push(nums[i]);
        }
        int answer[]=new int[nums1.length];
        for(int i:nums1) {
            ans 
        }
        return answer ;
    }
    public static void main(String[] args) {
        int []nums2 = {1,3,4,2} ;
        int[] nums1={4,1,2} ;

        for(int i:next(nums1, nums2)) {
            System.out.print(i+" ");
        }
       
    }
}
