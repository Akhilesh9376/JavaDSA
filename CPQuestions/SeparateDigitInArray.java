package CPQuestions;
/* 
import java.util.ArrayList;

public class SeparateDigitInArray {
    public static void printArray(int arr[]) {
        for(int i:arr) {
            System.out.print(i+" "); 
    }
}
    public static int count(int n) {
        int count =0 ;
        while(n!=0){
            int temp=n%10;
            n=n/10 ;
            count++ ;
        }
        return count ;
    }
    public static int[] separateDigit(int arr[]) {
        ArrayList<Integer> array1=new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            int digit=count(arr[i])-1;
            while (arr[i]!=0) {
                int temp=arr[i]/(int)(Math.pow(10,digit)) ;
                array1.add(temp);
                arr[i]=arr[i]%(int)(Math.pow(10,digit)) ;
                digit-- ;
            }
        }
        int finalArr[] =new int[array1.size()] ;
        for(int i=0;i<array1.size();i++) {
            finalArr[i]=array1.get(i) ;
        }
       return finalArr ;

    }
    public static void main(String args[]) {
        int arrar[]={152,32,43,58};
        int arr[]=separateDigit(arrar) ;
        printArray(arr);
    }
}
*/

import java.util.ArrayList;
class Solution {
    public static int count(int n) {
        int count =0 ;
        int zeroCount=0 ;
        while(n!=0){
            int temp=n%10;
            if (temp==0) {
                zeroCount++ ;
            }
            n=n/10 ;
            count++ ;
        }
        return count ;
    }
    
    public static int[] separateDigits(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>() ;
        for (int i=nums.length-1;i>=0;i++) {
            int n =nums[i];

            while(n!=0) {
                int digit =n%10;
                list.add(digit);
                n=n/10;
            }
        }

        int[] ans=new int[list.size()];
        for(int i=0;i<ans.length;i++) {
            ans[i]=list.get(list.size()-1-i) ;
        }

        return ans ;
    }
    

    public static void main (String[] args ) {
        int arr[] = {123,504,10,68};
        int arr1[]=separateDigits(arr);
        for(int i:arr1) {
            System.out.print(i+" ");
        }
    }
}
