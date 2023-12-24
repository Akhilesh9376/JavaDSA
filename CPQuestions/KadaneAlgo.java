package CPQuestions;

import java.util.ArrayList;

public class KadaneAlgo {
    public static void main (String[] args ) {
        int arr[]={1,2,7,-4,3,2,-10,9 ,1} ;
        int mx =0 ;
        int start=-1 ;
        int ansStart=-1 ;
        int ansEnd=-1 ;

        int sum=Integer.MIN_VALUE ;
        ArrayList<Integer> ans =new ArrayList<>() ;
        for(int i=0;i<arr.length;i++) {
            if (sum==0) {
                start= i ;
            }
            sum+=arr[i] ; 
            if (sum>0) {
                //mx=sum ;
                ansStart=start;
                ans.add(arr[ansStart]) ;
                ansEnd=i ;
            }
        }
        System.out.println(ans);
    }
}
