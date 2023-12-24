import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInArray {
     public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here 
        Set<Integer> set = new HashSet<>() ;
        HashMap<Integer,Integer> hm= new HashMap<>() ;
        for(int i=0;i<n;i++) {
            if(hm.containsKey(arr[i])) {
                set.add(arr[i]) ;
            }else{
                hm.put(arr[i],1) ;
            }
        }
        if (set.size() == 0 )
                set.add(-1) ;
                
        // ArrayList<Integer> list  = new ArrayList<>() ; 
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int arr[]= {3,4,12,13,12,3,4,4,12,7,11,6,5} ;
        int n = arr.length ;
        System.out.println(duplicates(arr, n));
        
    }
}
