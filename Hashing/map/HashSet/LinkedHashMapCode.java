package Hashing.map.HashSet;

import java.util.*;;
public class LinkedHashMapCode {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>(); // Ordered Set 
        lhm.put("India", 100) ;
        lhm.put("China", 120) ;
        lhm.put("Austria", 80);
        System.out.println(lhm);


        // In TreeMap Key Are in Sorted Order   And Time Complexity is O(logn);
        // Intrnall Application is Red Black Tree (BST)

    }
}
