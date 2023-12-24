package Hashing.set;
import java.util.HashSet;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>() ;
        /*
         * add(key)==>O(1) 
         * containsKey==>>O(1)
         * remove(Key)===>>O(1)
         */

         hs.add(1) ;
         hs.add(2) ;
         hs.add(3) ;
         hs.add(4) ;
         
        // Iteration On HastSet 
        // 1. Using Iterator 
        // 2. using enhanced for loop 
        Iterator it = hs.iterator() ;
        while(it.hasNext()) {
            System.out.print(it.next()+" ");  // O(n)
        }

        for(Integer i:hs) {
            System.out.print(i+" ");
        }


        // TreeSet :- Sorted in ascending Order 
        // NULL values are not allowed O(logn)
    }
}
