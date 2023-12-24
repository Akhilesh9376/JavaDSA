package CPQuestions;

import java.util.*;

public class PrintSubSequences {
    public static List<List<Integer>> subsets(int[] nums,int idx,List<Integer> list,int n) {

        List<List<Integer>> arr=new ArrayList<>() ;

        // Base Condition 
        if (idx==n){
            arr.add(list) ;
            
        }
        // Add the Particular index at the list 
        list.add(nums[idx]) ;
        subsets(nums, idx+1,list, n) ;
        list.remove(list.size()-1) ;

        // Not Pick the the element 

        subsets(nums, idx+1, list, n) ;

        return arr ;
    }
    public static void main(String[] args) {
        int[] nums={3,1,2} ;
        List<Integer> list=new ArrayList<>() ;
        List<List<Integer>> arr=subsets(nums, 0, list, 3) ;
        System.out.println(arr);
        
    }
}
