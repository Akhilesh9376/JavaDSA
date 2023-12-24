package DivideAndConquer;

public class QuickSort {
    public static void printArray(int arr[] ) {
        for(int i:arr) {
            System.out.print(i+" ");
        }
    }
    public static void quickSort(int arr[],int si,int ei){
        // last Element Pivot element 
        if (si>=ei) {
            return ;
        }
        int pidx=partition(arr,si,ei) ;
        quickSort(arr, si, pidx-1); // left side 
        quickSort(arr,pidx+1, ei);  // right side 
    }
    public static int partition(int arr[],int si,int ei) {
            int pivot =arr[ei] ;
            int i=si-1 ;// to make place element smaller than pivot 
            for (int j=si;j<ei;j++) {
                if (arr[j]<=pivot){
                    i++ ;
                    // swap
                    int temp = arr[j] ;
                    arr[j] =arr[i] ;
                    arr[i]=temp ;
                }
            }
            i++ ;
            int temp = pivot ;
            arr[ei] =arr[i] ;
            arr[i]=temp ;
            return i ;
    }
    public static void main(String args[]) {
            int arr[]={23,11,87,34,21,56};
            quickSort(arr, 0, arr.length-1);
            printArray(arr);
    }
}
