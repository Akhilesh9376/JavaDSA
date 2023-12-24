package CPQuestions;

public class MonotoneArray {
    public static boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                inc = false;
            }
            if (nums[i] < nums[i + 1]) {
                dec = false;
            }
        }
        return inc || dec ;
    }

    public static void main(String args[]) {
        int[] arr = { 5, 3, 2, 4, 1 };
        System.out.println(isMonotonic(arr));
    }
}
