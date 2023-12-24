package GreedyApproach;
import java.util.*;
/*
 * Disjoint Set 
 * Max Meeting in a Room
 */
public class ActivitySelection {
    public static void main(String[] args) {
        int start[]={7,6,2,7,3};
        int end[] ={10,6,10,9,5}; // end time basis sorted d
        // if End Time is Not Sorted then We need to sort them 
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]= i;
            activities[i][1]=start[i];
            activities[i][2]=end[i] ;
        }
        // Sorting 
        Arrays.sort(activities,Comparator.comparingDouble(o ->o[2]));

//        Arrays.sort(score,(a,b)->b[k]-a[k]); for decreasing order

        // Arrays.sort(score,(a,b)->a[k]-b[k]);  for increasing order 
         
        
        int maxAct= 0 ;

        ArrayList<Integer> ans=new ArrayList<>() ;

        // 1st Activity 
        maxAct=1 ;
        ans.add(0);
        int lastEnd=activities[0][2];

        for(int i=1;i<end.length;i++) {
                if (activities[i][1]>=lastEnd) {
                    // activity select 
                    maxAct++ ;
                    // ans.add(i);
                    lastEnd=activities[i][2];
                }
        }
        System.out.println("Max Activity is :"+ maxAct);
        System.out.println(ans);
    }
}
