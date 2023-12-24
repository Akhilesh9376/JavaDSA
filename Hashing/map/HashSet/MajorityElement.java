package Hashing.map.HashSet ;

import java.util.HashMap;
import java.util.ArrayList ;

// Given an Array of size n ,find all elements that appear more than [n/3] times 

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3}; 
        HashMap<Integer,Integer> hm =new HashMap<>() ;
        for(int i=0 ; i<nums.length;i++ ) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.values(nums[i]+1));
            }
        }
    }    
}
