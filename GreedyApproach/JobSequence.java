package GreedyApproach;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class JobSequence {
    static class Job{
        int deadLine ;
        int profit ;
        int id ; // 0->A    1->B   2->>C 

        public Job(int id,int deadLine,int profit){
            this.id=id ;
            this.deadLine=deadLine ;
            this.profit=profit ;
        }
    }
    public static void main (String args[]) {
        // int jobInfo[][]={
        //     {4,20},
        //     {1,10},
        //     {1,40},
        //     {1,30}
        // };

        // // Job jobs[]=new Job[jobInfo.length];
        // ArrayList<Job> jobs = new ArrayList<>();
        // for(int i=0; i<jobInfo.length;i++) {
        //     jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1])) ;
        // }
        // Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit); // descending order 

        // // Creating the new ArrayList 
        // ArrayList<Integer> ans=new ArrayList<>() ;
        // int time =0 ;

        // for(int i=0;i<jobs.size();i++) {
        //     Job curr=jobs.get(i);
        //     if (curr.deadLine>time) {
        //         ans.add(curr.id);
        //         time++ ;
        //     }
        // }
        // System.out.println(ans);
        try {
            int i ,sum ;
            sum = 10 ;
            for( i=-1 ;i<3;++i ){
                sum=(sum/i) ;
            }
        } catch (Exception e) {
            System.out.println("0");
        }
        System.out.println(sum);
    }
}
