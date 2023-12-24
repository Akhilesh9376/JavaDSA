package ArrayLists;

import java.util.*;
public class WaterConatainer {
    public static int maxWater(ArrayList<Integer> arr) {
        int maximumWater=0 ;
        for (int i=0;i<arr.size();i++) {
            for (int j=i+1;j<arr.size();j++) {
                int height=Math.min(arr.get(i), arr.get(j)) ;
                int width =j-i ;
                int water=height*width ;
                maximumWater=Math.max(maximumWater, water) ;

            }
        }
        return maximumWater ;
    }

    // optimized Code 
    public static int maxWaterOptimized(ArrayList<Integer> arr) {
        int start=0,end=arr.size()-1,maxwater=0 ;
        while(start<end) {
            int height=Math.min(arr.get(end), arr.get(start));
            int width=end-start ;
            int water=height*width ;
            maxwater=Math.max(maxwater, water);
            if (arr.get(start)<arr.get(end)) {
                    start++ ;
            }else{
                end-- ;
            }

        }
        return maxwater ;
       
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>() ;
        arr.add(1);arr.add(1) ;

        System.out.println(maxWaterOptimized(arr));

    
    }
}
