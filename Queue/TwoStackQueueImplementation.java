package Queue;

import java.util.Stack;

public class TwoStackQueueImplementation {
    static class Queue{
        static Stack<Integer> s1=new Stack<>() ;
        static Stack<Integer> s2=new Stack<>() ;

        public static boolean isEmpty() {
            return s1.isEmpty() ;
        }

        // add 
        public static void add(int data) {
            // Step 1: - 
            while(!s1.isEmpty()) {
                s2.push(s1.pop()) ;
            }

            // Step 2:- 
            s1.push(data) ;

            // Step 3:- 
            while(!s2.isEmpty()) {
                s1.push(s2.pop()) ;
            }
        }
        public static int remove () {
            if (isEmpty()) {
                System.out.println("Queue empty ");
                return -1 ;
            }
            return s1.pop() ;
        }

        // peek 
        public static int peek() {
            if(isEmpty()) {
                System.out.println("queue empty");
                return -1 ;
            }
            return s1.peek() ;
        }
    }
    public static void main(String[] args) {
            Queue q=new Queue();
            q.add(11);
            q.add(12);
            q.add(13);
            q.add(14);

            while(!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove() ;
            }
    }
}
