package CPQuestions;

public class AddingZeroesToLast {
    public static void addToLast(int nums[]) {
        // finding the index of the first zeroes element 
        int j=-1 ;
        for (int i=0;i<nums.length;i++) {
            if (nums[i]==0) {
                j=i ;
                break ;
            }
        }
        
        for (int i=j+1;i<nums.length;i++) {
            
            if (nums[i]!=0) {
                int temp=nums[j] ;
                nums[j]=nums[i] ;
                nums[i]=temp ;
                
                j++ ;
            }
        }
    }
    public static void print(int nums[]) {
        for (int i:nums) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args ) {
            int[] nums={0,1,0,3,12};
            addToLast(nums);
            print(nums);
            
    }
}
