package Hashing.set;

import java.util.HashSet;

public class CountDistinct {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,6,8,9,9};
        HashSet<Integer> hs = new HashSet<>() ;
        for(int i=0;i<nums.length;i++) {
            hs.add(nums[i]);
        }
        int distinctElement=hs.size() ;
        System.out.println("The Unique Number is :"+distinctElement);
    }
}
