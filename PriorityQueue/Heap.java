package PriorityQueue;

import java.util.ArrayList;



public class Heap {
    static class HeapImplementation {
        ArrayList<Integer> arr=new ArrayList<>() ;

        // From Parent To  Child 
        // 1. left Child 2x+1 ;
        // 2. Right Child 2x+2;


        // From Child To Parent 
        // (x-1)/2
        public void add(int data ) {
            // add at last index ;
            arr.add(data) ;   // this takes the Constant Time 
            int x=arr.size()-1 ;  // x is child index 
            int par=(x-1)/2 ;  // parent index 

            while(arr.get(x )< arr.get(par)) { // This Takes the O(logn) ;
                // swap 
                int temp =arr.get(x) ;
                arr.set(x,arr.get(par)) ;
                arr.set(par, temp) ;

                x=par ;
                par=(x-1) / 2 ;
            }
        }

        // Peek The Element from the Heap 
        public int peek() {
            return arr.get(0);
        }

        // Function for the Heapify 

        private void heapify(int idx) {
            int left =(2*idx)+1;
            int right =(2*idx)+2 ;
            int minIdx=idx ;

            if (left < arr.size()  &&  arr.get(minIdx) > arr.get(left)) {
                minIdx=left ;
            }

            if (right< arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx=right ;
            }

            if (minIdx!=idx) {
                int temp = arr.get(idx) ;
                arr.set(idx, arr.get(minIdx)) ;
                arr.set(minIdx,temp);

                heapify(minIdx);
            }
        }

        public  int remove() {
            int data = arr.get(0) ;

            // step 1 : swap First And Last 
            int temp =arr.get(0) ;
            arr.set(0, arr.get(arr.size()-1)) ;
            arr.set(arr.size()-1, temp) ;

            // Step 2 : Delete last ; 
            arr.remove(arr.size()-1);

            // Step 3: 
            // Heapify

            heapify(0);

            return data ;
        }

        public boolean isEmpty(){
            return arr.size()==0 ;
        }
    }
    public static void main(String[] args) {
        
    }
}
