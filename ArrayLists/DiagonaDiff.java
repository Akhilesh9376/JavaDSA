import java.util.ArrayList;
import java.util.List;

public class DiagonaDiff {
     public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here 
    
    int row =arr.size() ;
    int left = 0 ;
    int right = 0 ;
    int start = 0 ;
    int end = row-1 ;
    
    for (int i=0;i<arr.size();i++) {
        List<Integer> currList = arr.get(i) ;
        for(int j=0;j<1;j++) {
            left+= currList.get(start) ;
            start++ ;
            right+= currList.get(end) ;
            end-- ;
        }
    }
    return Math.abs(right-left) ;

    }
    public static void main(String[] args) {
        
    }
}
