package PriorityQueue ;
import java.util.*;
public class Main {
    static class Student implements Comparable<Student> {
        String name ;
        int rank ;

        Student(String name ,int rank ) {
            this.name=name ;
            this.rank=rank ;
        }

        @Override 
        public int compareTo(Student s2){
            return this.rank-s2.rank ;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>() ;
        pq.add(3);  // add takes O(logn)
        pq.add(4) ;
        pq.add(7);
        pq.add(1) ;

        while(!pq.isEmpty()) {
            //System.out.print(pq.peek()+ " ");  // O(1) 
            // pq.remove() ;  // remove takes O(logn)
            System.out.println(pq.poll()+" ");
        }

        
    }
}