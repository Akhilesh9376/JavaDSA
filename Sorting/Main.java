package Sorting ;
import java.util.* ;
public class Main {
    public static void bubbleSort(int arr[]) {
        for (int turn =0 ;turn <arr.length-1;turn++){
            for (int j=0 ;j<arr.length-1-turn;j++){
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j] ;
                    arr[j]=arr[j+1] ;
                    arr[j+1]=temp ;
                }
            }
        }
    }
    // Modified Bubble Sort 
    public static void modifiedBubbleSort(int arr[]) {
        for (int i=0;i<arr.length;i++) {
            boolean swapped=false ;
            for(int j=0;j<arr.length-1-i;j++) {
                
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j] ;
                    arr[j+1]=temp ;
                    swapped =true ;
                }
            }
            if(swapped==false) {
                break ;
            }
        } 
    }
    // Selection Sort 
    public static void selectionSort(int arr[] ){
        for (int i=0;i<arr.length-1;i++) {
            int minPos=i ;
            for (int j=i+1;j<arr.length;j++){
                if (arr[minPos]<arr[j]){
                    minPos=j ;
                }
            } 
            int temp =arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp ;
        }
    }

    public static void printArray(int arr[]){
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println() ;
    }
    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE ;
        for (int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }
        int count[]=new int[largest+1] ;
        for (int i=0 ;i<arr.length;i++) {
            count[arr[i]]++ ;
        }
    }
    public static void main(String args[]){
            int arr[]={3,2,1,5,4};
            Arrays.sort(arr,Collections.reverseOrder());
            printArray(arr);
    }
}
