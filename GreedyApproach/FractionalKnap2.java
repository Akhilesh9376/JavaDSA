package GreedyApproach ;
import java.util.* ;
public class FractionalKnap2 {
    static class Ratio implements Comparable<Ratio> {
        double idx ;
        double ratio ;

        public Ratio(double idx,double ratio) {
            this.idx=idx ;
            this.ratio=ratio ;
        } 
        @Override
       public double compareTo(Ratio r2){
            return Double.compare(r2.ratio-this.ratio); 
}
    }
    public static void main(String[] args) {
        PriorityQueue<Ratio> pq=new PriorityQueue<>() ;
        int val[]={1,2,3} ;
        int wights[]={4,5,1} ;
        int W=50 ;
        for(int i=0;i<val.length;i++) {
            double ratio=val[i]/(double)wights[i] ;
            pq.add(new Ratio(i, ratio)) ;
        }
        int capacity= W ;
        int finalVal= 0 ;

          for (int i=0;i<pq.size();i++) {
            int ratio=(int) pq.remove().ratio;
            if (capacity>ratio) {
                finalVal+=ratio ;
                capacity-=ratio ;
            }else{
                finalVal+=ratio*capacity ;
                capacity=0 ;
                break ;
            }
        }
        System.out.println("Final Answer : " +finalVal);

    }
}
