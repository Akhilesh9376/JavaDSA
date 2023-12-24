package Stack;

import java.util.Stack;

public class MaximumRectangleAreaInHistogram {
    public static int maxArea(int[] heights) {
        int max=0 ;
        int nsr[]=new int[heights.length] ;
        int nsl[]=new int[heights.length] ;

        // Next Smaller Right 
        Stack<Integer> s=new Stack<>() ;
        for (int i=heights.length-1;i>=0;i--) {
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]) {
                s.pop() ;
            }
            if (s.isEmpty()) {
                nsr[i]=heights.length;
            }else{
                nsr[i]=s.peek() ;
            }
            // push the index in the stack 
            s.push(i) ;
        } 

        // Next Smaller left 
        s=new Stack<>();
        for (int i=0;i<heights.length;i++) {
            while(!s.isEmpty() && heights[s.peek()]>=heights[i] ) {
                s.pop() ;
            }
            if (s.isEmpty()) {
                nsl[i]= -1 ;
            }else {
                nsl[i]=s.peek() ;  
            }
            s.push(i);
        }

        // Current Area : width=j-i-1=nsr[i]-nsl[i]-1 ;
        for (int i=0;i<heights.length;i++) {
            int area = heights[i]*(nsr[i]-nsl[i]-1) ;
            max=Math.max(max, area) ;
        }

        return max ;
    }
    public static void main(String[] args) {
        int[] arr={2,1,5,6,2,3};
        System.out.println("The Maximum Area is : "+maxArea(arr));
    }
}
