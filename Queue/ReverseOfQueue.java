package Queue;
import java.util.*;
public class ReverseOfQueue {
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s=new Stack<>() ;
        while(!q.isEmpty()) {
            s.push(q.remove()) ;
        }
        while(!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> i=new LinkedList<>() ;
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
        i.add(5);
        reverse(i);
        
        while(!i.isEmpty()) {
            System.out.print(i.remove()+" ") ;
        }
    }
}
