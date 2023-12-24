package Stack;

import java.util.Stack;

public class NextGreaterElement {
    // Apply the Brute Force methodd
    public static void nextGreaterElement(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] < arr[j]) {
                    arr[i] = arr[j];
                    break;
                }
            }
            // arr[i]=-1 ;
        }
        // arr[]
    }

    // Writing the optimal code

    public static void main(String[] args) {
        int[] arr = { 6, 3, 1, 5, 7, 1 };
        Stack<Integer> s = new Stack<>();
        int[] nxtGreater = new int[arr.length];

        // Step 1 :-
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // Step 2 :-
            if (s.isEmpty()) {
                nxtGreater[i]=-1 ;
            }else{
                nxtGreater[i]=arr[s.peek()];
            }

            // Step 3 :-
            s.push(i);
        }

        for(int i=0;i<nxtGreater.length;i++) {
            System.out.print(nxtGreater[i]+" ");
        }

    }
}