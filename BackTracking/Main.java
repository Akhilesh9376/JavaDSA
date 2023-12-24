package BackTracking;

public class Main {
    //  Creating the function for printing the Element of the Array
    public static void printArr(int[] arr) {
        for(int i:arr) {
            System.out.print(i+" " ) ;
         }
    }

    public static void changeArr(int arr[],int idx,int value ) {
        // base case ;
        if (idx==arr.length) {
            printArr(arr);
            return ;
        }
        arr[idx]=value ;
        // call stacks for the UP
        changeArr(arr, idx+1, value+10);
        
        // Call Stack Comming down 
        // This step is called BackTracking Step 
        arr[idx]=arr[idx]-2 ;
    }

    // program for printing the subsets of the Array 
    public static void printSubsets (String str,String ans,int idx){
        // base case 
        if (idx==str.length()) {
            if (ans.length()==0) {
                System.out.print("null");
            }
            System.out.print(ans+" ");
            return ;
        }

        // if Choice is Yes 
        printSubsets(str, ans+str.charAt(idx), idx+1);

        // if choice is no 
        printSubsets(str, ans, idx+1);
    }

    // find & print permutation of a String 
    public static void printPermutation(String str,String ans ) {
        // Base Case 
        if (str.length()==0) {
            System.out.print(ans+" ");
            return ;
        }

        // Recursion 
        for (int i=0;i<str.length();i++) {
            char curr=str.charAt(i) ;
            String newStr=str.substring(0, i)+str.substring(i+1);
            printPermutation(newStr,ans+curr); 
        }
    } 
    public static void main (String[] args) {
        printPermutation("ABC", ""); 
    }
}
