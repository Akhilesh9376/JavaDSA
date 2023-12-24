package Stack;

import java.util.Stack;
public class DuplicateParentheses {
    public static boolean isDuplicate(String str ) {
        Stack<Character> st=new Stack<>() ;

        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i) ;

            // Case:-1  Opening ,Operator,Operands 

            // Case:-2 Closing 
            if (ch==')' ) {
                int count=0 ;
                while(!st.isEmpty() && st.peek()=='(' ) {
                    st.pop() ;
                    count++ ;
                }
                if (count<1) {
                    return true ;   // Duplicate Exists 
                }else{
                    st.pop() ;
                }
            } else {
                st.push(ch) ;
            }
        }
    }
    public static void main (String[] args ) {

    }
}
