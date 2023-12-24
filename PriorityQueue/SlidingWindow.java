package PriorityQueue;
import java.util.*;
public class SlidingWindow {
    public static class Pair implements Comparable<Pair>{
        int val ;
        int idx ;
        public Pair(int num,int idx ) {
            this.val=num ;
            this.idx=idx ;
        }

        @Override 
        public int compareTo(Pair p2 ) {
            // return this.num - p2.num ; // For Ascending Order 

            // For Descending Order 
            return p2.val - this.val ;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7} ;
        int n=arr.length ;
        int k=3 ;
        int[] result=new int[n-k+1] ;

        PriorityQueue<Pair> pq = new PriorityQueue<>() ;

        // Store The First Window 

        for(int i=0;i<k;i++) {
            pq.add(new Pair(arr[i],i)) ;
        }

        result[0]=pq.peek().val ;

        for(int i=k;i<n;i++) {
            while(pq.size() > 0 && pq.peek().idx <= (i-k)) {
                pq.remove();
            }

            pq.add(new Pair(arr[i], i));

            result[i-k+1]= pq.peek().val ;

        }

        
            // Print The Result 
            for(int K:result) {
                System.out.print(K+" ");
            }
    }
}
