package CPQuestions;
import java.util.*;
public class TribonnaciSeries {
    public static int tribonacci(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(0,0);
        arr.add(1,1);
        arr.add(2,1);

        for (int i=3;i<=n;i++) {
            arr.add(i,arr.get(i-1)+arr.get(i-2)+arr.get(i-3));
        }
        return arr.get(arr.size()-1);
    }
    public static void main(String[] args ) {
        System.out.println(tribonacci(25));
    }
}
