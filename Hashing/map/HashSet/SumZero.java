package Hashing.map.HashSet ;

import java.util.HashMap;

public class SumZero {
    public static void main(String[] args) {
        int[] arr={15,-2,2,-8,1,7,10,23} ;
        HashMap<Integer,Integer> hm=new HashMap<>() ; // (sum,idx) ;
        int sum=0,len=0 ;
        // Sum(0,j)-sum(0,i)=sum(i+1,j);
        // Sum(0,j)-sum(0,i-1)=sum(0,i) ;
        for(int j=0;j<arr.length;j++) {
            sum+=arr[j] ;
            if (hm.containsKey(sum)) {
                len=Math.max(len,j-hm.get(sum)) ;
            }else {
                hm.put(sum,j) ;
            }
        }
        System.out.println("Largest Subarray with sum equals zero =>"+len);
    }
}
