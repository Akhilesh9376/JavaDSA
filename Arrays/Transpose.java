package Arrays;

import java.util.ArrayList;

public class Transpose {
    public static void printMatrix(int[][] arr) {
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int row=matrix[0].length ;
        int col=matrix.length ;
        int[][] ans =new int[row][col] ;
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[0].length;j++) {
                ans[j][i]=matrix[i][j] ;
            }
        }
        return ans ;
    }
    //
    public static void main (String args[]) {
        
    }
}
