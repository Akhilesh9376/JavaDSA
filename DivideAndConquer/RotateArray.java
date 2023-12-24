package DivideAndConquer ;

public class RotateArray{
    public static int search(int arr[],int target,int si,int ei ) {
        if (si>ei) {
            return -1 ;
        }
        // finding the mid value 
        int mid=(si+ei)/2 ;
        // case 
        if (arr[mid]==target) {
            return mid ;
        }
        //  mid on L1
        if (arr[si]<=arr[mid]) {
            // case a : Left
            if (arr[si]<= target  && target<= arr[mid]) {
                return search(arr, target, si,mid-1) ;
                // case b: right 
            }else{
                return search(arr, target, mid+1, ei) ;
            }
            // mid on L2
        }else{
            // case c: right 
            if (arr[mid]<=target && target <=arr[ei] ) {
                return search(arr, target,mid+1, ei) ;
            }else{
                // case d: left 
                return search(arr, target, si, mid-1) ;
            }

        }

    }
    public static void main (String args[]) {
        int arr[]={4,5,6,7,0,1,2};
        int target =0 ;
       int targetIndex= search(arr, target, 0, arr.length-1) ;
       System.out.println(targetIndex);
    }
}