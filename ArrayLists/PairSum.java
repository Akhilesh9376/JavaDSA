package ArrayLists;
import java.util.ArrayList;

public class PairSum {
    public static boolean pairSum(ArrayList<Integer> arr,int target ) {
        ArrayList<Integer> ans=new ArrayList<>() ;
        for (int i=0;i<arr.size();i++) {
            for (int j=i+1;j<arr.size();j++) {
                if (arr.get(i)+arr.get(j)==target) {
                    ans.add(arr.get(i)) ;
                    ans.add(arr.get(j)) ;
                    return true ;
                }
            }
        }
        return false ;
    }

    // optimized approach 
    public static boolean optimizedPairSum(ArrayList<Integer> arr,int target ) {
        int start =0 ,end=arr.size()-1 ;
        while(start!=end) {
            if (arr.get(start)+arr.get(end)==target) {
                return true ;
            }
            if (arr.get(start)+arr.get(end)<target) {
                start++ ;
            }else{
                end-- ;
            }
        }
        return false ;
    }
    public static void main (String[] args ) {
        ArrayList<Integer> arr=new ArrayList<>() ;
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        boolean b=optimizedPairSum(arr, 50);
        System.out.println(b);
    }
}
