package ArrayLists;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    // Finding the Maximum Size of the Element 
    public static int findMax(ArrayList<Integer> list) {
        int maximum=Integer.MIN_VALUE ;
        for (int i=0;i<list.size();i++) {
            maximum=Math.max(maximum,list.get(i)) ;
        }
        return maximum ;
    }

    // Swap Two Number in the ArrayList 
    public static void swap(ArrayList<Integer> list,int idx1,int idx2) {
        int temp=list.get(idx1) ;
        list.set(idx1,list.get(idx2)) ;
        list.set(idx2,temp) ;
    }
     
    
    public static void main (String[] args ) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2) ;
        list.add(3) ;
        list.add(0);
        list.add(5) ;
        System.out.println(list);
        // swap(list, 0, 4);
        // System.out.println(list);


        // Sorting An ArrayList
        // Ascending
        Collections.sort(list) ;
        System.out.println(list) ;

        // Descending Order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        
    }
}
