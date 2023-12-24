package GreedyApproach;
import java.util.*;
public class Chocola {
    public static void main(String[] args) {
        int n=4 ;
        int m=6 ;
        Integer costVertical[]={2,1,3,1,4};   // m-1 
        Integer costHorizontal[]={4,1,2};  // n-1
        Arrays.sort(costHorizontal,Collections.reverseOrder()) ;
        Arrays.sort(costVertical,Collections.reverseOrder());

        int h=0 ,v=0 ;
        int hp=1,vp=1 ;
        int cost =0 ;
        while(h<costHorizontal.length && v<costVertical.length) {
            // Verical Cost  < Horizontal Cost 
            if (costVertical[v] <= costHorizontal[h]) { //  Horizontal cost 
                cost+=costHorizontal[h]*vp ;
                hp++ ;
                h++ ;
            }else {
                cost+=costVertical[v]*hp ;
                vp++ ;
                v++ ;
            }
        }

        // if the cut get's left 

        while(h<costHorizontal.length) {
            cost+=costHorizontal[h]*vp ;
            hp++ ;
            h++ ;
        }

        while(v<costVertical.length) {
            cost+=costVertical[v]*hp ;
            vp++ ;
            v++ ;
        }
        System.out.println("Minumum Cost of Cut :"+cost);
    }
}
