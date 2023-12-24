package Hashing.set;

import java.util.HashSet;

public class UnionAndIntersection{
    public static void main(String[] args) {
        int[] arr1={7,3,9} ;
        int[] arr2={6,3,9,2,9,4};
        HashSet<Integer> hs=new HashSet<>() ;
        // Union 

        for(int i=0;i<arr1.length;i++) {
            hs.add(arr1[i]) ;
        }
        for(int i=0;i<arr2.length;i++) {
            hs.add(arr2[i]);
        }
        System.out.println("Size of Union is :"+hs.size());

        // Intesection 
        hs.clear();
        int count= 0 ;
        for(int i=0;i<arr1.length;i++) {
            hs.add(arr1[i]) ;
        }
        for(int i=0;i<arr2.length;i++) {
            if (hs.contains(arr2[i])) {
                hs.remove(arr2[i]);
                count++ ;
            }
        }
        System.out.println("Intersection Count is : "+count );


    }
}