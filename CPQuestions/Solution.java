package CPQuestions;
/*
public class Solution {
    public static int distinctIntegers(int n) {
        int count=1 ;
        while(n>1){
            if (n%(n-1)==1){
                count++ ;
            }
            n-- ;
        }
        return count ;
    }
    public static int getCommon(int[] nums1, int[] nums2) {
        int smallest=Integer.MAX_VALUE ;
        for(int i:nums1){
            for (int j:nums2){
                if (i==j && smallest > i){
                    smallest=i ;
                }
            }
        }
        return smallest ;
    }
    public static void main(String args[]) {
        int n1[]={1,2,3,6};
        int n2[]= {2,3,4,5} ;
        int n= getCommon(n1,n2);
        System.out.println(n);

    }
}
 */
import java.util.ArrayList;
class Solution {
    public int[] separateDigits(int[] nums) {
      
       ArrayList<Integer> arr = new ArrayList<Integer>();
       for (int i=0;i<nums.length;i++) {
           while(nums[i]!=0) {
               arr.add(nums[i]/10) ;
               nums[i]=nums[i]%10 ;
           }
       }
       // Object[] objects = arr.toArray();
       int arr1[]=new int[arr.size()] ;
       for(int i=0;i<arr.size();i++){
        arr1[i]=arr.get(i) ;
       }
       return arr1 ;
    }
        

    public static void main(String[] args ) {
        Solution s = new Solution() ;
        int arr[]={13,15,17,19} ;
        for(int i:s.separateDigits(arr)){
            System.out.print(i+" ");
        }
    }
}