package Arrays;
// 
// https://leetcode.com/problems/pascals-triangle/
public class RotateArray {
    public static int[] rotateLeftByOne(int[] arr) {
        int temp=arr[0] ;
        for (int i=1;i<arr.length;i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp ;

        return  arr ;
    }

    // Rotate the Array by d place 
    public static int[] rotateLeftByNPlace(int[] arr,int size,int k) {
        k=k%size ;
        k=size-k ;
        int temp[]=new int[k] ;
        for (int i=0;i<k;i++) {
            temp[i]=arr[i];
        }

        for (int i=k;i<size;i++) {
            arr[i-k]=arr[i] ;
        }
        for (int i=0;i<k;i++) {
            arr[size-k+i]=temp[i];
        }
        return arr ;
    }
    public static void main (String[] args ) {
        int[] arr={1,2,3,4,5,6,7};
        for (int i:rotateLeftByNPlace(arr,arr.length,10)){
            System.out.print(i+" ");
        }
    }
}
