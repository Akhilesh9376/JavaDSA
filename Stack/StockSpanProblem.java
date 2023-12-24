package Stack;
import java.util.*;
public class StockSpanProblem {
    public static void stockSpan(int stock[],int span[]) {
        Stack<Integer> s=new Stack<>() ;
        span[0]=1 ;
        s.push(0);

        for (int i=1 ;i<stock.length;i++) {
            int currPrice=stock[i] ;
            while(!s.isEmpty() && currPrice > stock[s.peek()]) {
                s.pop() ;
            }
            if (s.isEmpty()) {
                span[i]=i+1 ;
            }else{
                int prevHigh=s.peek() ;
                span[i]=i-prevHigh ;
            }
            s.push(i); 
            // span = i=prevHigh ;
        }

    }
    public static void main (String[] args ) {
        
    }
}
