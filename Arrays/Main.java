package Arrays;

public class Main {
    public static int linearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // finding the largest value
    public static int largestNumber(int number[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static int binarySearch(int number[], int key) {
        int start = 0, end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // comparision
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {// right
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // program for swapping the array
    public static void swap(int n1, int n2) {

    }

    // reverse the array
    public static void reverseArray(int number[]) {
        int first = 0, last = number.length - 1;

        while (first < last) {
            int temp = number[first];
            number[first] = number[last];
            number[last] = temp;
            first++;
            last--;
        }
    }
    public static void pairPrinting(int number[] ){
        for (int i=0;i<number.length;i++) {
            for (int j=i+1;j<number.length;j++) {
                System.out.print("("+number[i]+","+number[j]+")") ;
            }
            System.out.println();
        }
    }
    public static void printSubArray(int number[]) {
        for (int i=0;i<number.length;i++){
            for (int j=i;j<number.length;j++) {
                for (int k=i;k<=j;k++){
                    System.out.print(number[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    // program for sum of sub array ;
    public static void sumSubArray(int number[]) {
        int sum =0 ;
        for (int i=0;i<number.length;i++) {
            for (int j=i;j<number.length;j++) {
                for (int k=i;k<=j;k++) {
                    System.out.print(number[k]);
                    for (int l=0;l<number.length;l++){
                        sum+=number[0] ;
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void kadaness(int number[]){
        int ms=Integer.MIN_VALUE ;
        int cs =0 ;

        for (int i=0;i<number.length;i++){
            cs=cs+number[i] ;
            if (cs<0){
                cs=0 ;
            }
            ms=Math.max(cs,ms) ;
            
        }
        System.out.println("our max subarray sum is :"+ms);
    }
    public static void main(String[] args) {
        int number[]={1,2,4,5};
        // sumSubArray(number) ;
        kadaness(number) ;
        
    }
}
