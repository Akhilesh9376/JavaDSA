package Hashing.map.HashSet;
import java.util.*; 
public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>() ; // It is an UnOrdered Map 
        // Insert Element 
        hm.put("India", 100) ;
        hm.put("China", 120);
        hm.put("Canada", 80) ; // Insert Element in O(1) ;

        System.out.println(hm);


        // get O(1)
        int population = hm.get("India");
        System.out.println(population);


        // ContainsKey() ;  // Time Complexity is O(1) ;

        //System.out.println(hm.containsKey("Indi")); 

        // Remove O(1) 
        // System.out.println(hm.remove("China"));
        //fSystem.out.println(hm);


        // size() O(1);
        //System.out.println(hm.size());
        // hm.clear();
        //System.out.println(hm.isEmpty());


        // Iteration On Key Set 

        // Set<String> key =hm.keySet();

        // for(String s:key) {
        //     System.out.print(hm.get(s)+"  ");
        // }
        System.out.println(hm.entrySet());
    }
}
