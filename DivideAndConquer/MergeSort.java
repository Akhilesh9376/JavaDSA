package DivideAndConquer;

public class MergeSort {
    public static void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);// left Part ;
        mergeSort(arr, mid + 1, ei); // right part ;

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si; // iterator for the left part ;
        int j = mid + 1; // iterator for the right part
        int k = 0; // iterator for temp arr ;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = temp[j];
                j++;
            }
            k++ ;
        }
        // some left element from the left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // some left element from the right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
            
        }
       

    }

    public static void main(String[] args) {
        int arr[] = { 32, 12, 76, 22, 9, 7 };
        mergeSort(arr, 0, arr.length-1); 
    }
}
