package GreedyApproach;
import java.util.*;

public class FractionalKnapsack {

    public static void main (String[] args) {
        // int val[]={60,100,120};
        int val[]={1,2,3} ;
        int wights[]={4,5,1} ;
        // int wights[]={10,20,30};
        int W=50 ;

        // creating the 2 D array 
        double ratio[][]=new double[val.length][2] ;
        // 0th col=> Index  ;And !st col => ratio

        for (int i=0;i<val.length;i++) {
            ratio[i][0]= i ;
            ratio[i][1]= val[i]/(double)wights[i] ;
        }
        // sorting in the asc order ;
        Arrays.sort(ratio,Comparator.comparingDouble(o ->o[1]));

        int capacity= W ;
        int finalVal= 0 ;

        for (int i=ratio.length-1;i>=0;i--) {
            int idx=(int)ratio[i][0] ;
            if (capacity>wights[idx]) {
                finalVal+=val[idx] ;
                capacity-=wights[idx] ;
            }else{
                finalVal+=ratio[i][1]*capacity ;
                capacity=0 ;
                break ;
            }
        }
        System.out.println("The Maximum Amount is :"+finalVal);
    }
}
