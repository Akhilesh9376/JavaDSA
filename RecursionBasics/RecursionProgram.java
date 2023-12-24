package RecursionBasics;

import java.util.*;

public class RecursionProgram {
   
    // program for swapping the two number 
    public static void swap(int arr[],int start,int end ) {
        int temp=arr[start] ;
        arr[start]=arr[end] ;
        arr[end]=temp ;
    }
    // Write a Program for Swapping two nunber by recursion
    public static void reverse1(int arr[],int start,int end) {
        if (start>=end) {
            return ;
        }
        swap(arr,start,end) ;
        reverse1(arr, start+1, end-1);
    }
    // Writing the program for reversing using a single variable 
    public static void reverse2(int arr[],int start,int n) {
            if (start>=n) {
                return ;
            }
            swap(arr, start, n-start-1);
            reverse2(arr, start+1, n);
    }
    // Write a Program for check Pallindrome 
    public static boolean pallindromeString(String s,int idx) {
        if (idx>=s.length()/2) {
            return true ;
        }
        if (s.charAt(idx)!=s.charAt(s.length()-idx-1)) {
            return false ;
        }
        return pallindromeString(s, idx+1) ;
    }
    public static void printArr(int[] arr) {
        for(int i:arr) {
            System.out.print(i+" ") ;
        }
    }
    public static void printSubsequences(int[] arr,ArrayList<Integer> list ,int idx) {
        
        if (idx>=arr.length) {
            System.out.println(list+" ");
            return ;
        }
        list.add(arr[idx]) ;
        printSubsequences(arr,list, idx+1);

        list.remove(list.size()-1) ;
        printSubsequences(arr, list,idx+1);
    }
    // program for subseuence of sum of two number 
    public static void findSum(int arr[],ArrayList<Integer> list,int idx,int sum) {
        if (idx>=arr.length) {
            if (sum==2) {
                    System.out.println(list);
            }
            
            return ;
        }

        list.add(arr[idx]) ;
        sum+=arr[idx] ;
        findSum(arr, list, idx+1,sum);

        sum-=arr[idx] ;
        list.remove(list.size()-1) ;
        findSum(arr, list, idx+1, sum);
    }
  // Program for Printing any one of the subsequences 
    public static boolean printAnySubsequences(int idx,int[] arr,List<Integer> list,int target,int sum)  {
        if (idx==arr.length) {
            if (target==sum) {
                System.out.println(list);
                return true ;
            }
            return false ;
        }

        list.add(arr[idx]);
        sum+=arr[idx] ;
        // For Picking of the element 
        if (printAnySubsequences(idx+1, arr, list, target, sum)==true ) {
            return true ;
        }

        list.remove(list.size()-1) ;
        sum-=arr[idx] ;
        // for Not Picking the element 
        if (printAnySubsequences(idx+1, arr, list, target, sum)==true) {
            return true ;
        }

        return false ;

    }

    // print the total subsequences 
    public static int countSubsequences(int idx,int[] arr,int sum,int target) {
        if (idx==arr.length) {
            if (sum==target) {
                return 1 ;
            }
            else {
                return 0 ;
            }
        }
        sum+=arr[idx] ;
        int left=countSubsequences(idx+1, arr, sum, target);

        sum-=arr[idx] ;
        int right=countSubsequences(idx+1, arr, sum, target) ;

        return right+left ;
    }
    public static void main(String[] args ) {
       int[] arr={1,2,1} ;
       // List<Integer> s=new ArrayList<>() ;
       // printAnySubsequences(0, arr,s, 2, 0); 

       // System.out.println(countSubsequences(0, arr, 0, 2));
       
    }
}
