package TwoDArray;

import java.util.Scanner;

public class Main {
    // largest element in the 2d Array
    public static int largestElement(int arr[][]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                }
            }
        }
        return largest;
    }
    public static void printSpiral(int matrix[][]) {
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1 ;
        int endCol=matrix[0].length-1 ;
        while(startRow<=endRow && startCol<=endCol){
            // top 
            for (int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            // right
            for (int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            // bottom
            for (int j=endCol-1 ;j>=startCol;j--){
                if (startRow==endRow){
                    break ;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            // left 
            for (int i=endRow-1;i>=startRow+1;i--){
                if (startCol==endCol){
                    break ;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++ ;
            startRow++ ;
            endCol-- ;
            endRow-- ;
        }
    }
    public static int diagonalSum(int matrix[][]) {
        int sum=0 ;
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[0].length;j++){
                if (i==j){
                    sum+=matrix[i][j] ;
                }
                else if (i+j==matrix.length-1) {
                    sum+=matrix[i][j] ;
                }
            }
        }
        return sum ;
    }
    // writing the optimized code for matrix 
    public static int optimizedDiagonalSum(int matrix[][]) {
        int sum=0 ;
        for (int i=0;i<matrix.length;i++) {
            // Primary Diagonal
            sum+=matrix[i][i] ;

            if (i!=matrix.length-1-i)
                sum+=matrix[i][matrix.length-i-1];

        }
        return sum ;
    }
    public static void searchNumber(int matrix[][],int targetKey){
            int row=3,col=0 ;
            while (row>=0 && col>=0) {
                if (matrix[row][col]==targetKey){
                    System.out.println("Found At "+"("+row+","+col+")");
                    return;
                }else if (targetKey>matrix[row][col]){
                    col++ ;
                }else{
                    row-- ;
                }
            }
    }
    /*
     * Practice Set Question is 
     * Going On from here 
     * 
     */

     /*
      * Question 1 :Print the number of 7’s that are inthe 2d array.
      Example :Input - int[][] array = { {4,7,8},{8,8,7} };
      Output - 2
      */
    public static void countNumber(int matrix[][],int givenNumber) {
        int count =0 ;
        for(int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[0].length;j++) {
                    if (matrix[i][j]==givenNumber){
                        count++ ;
                    } ;
            }
        }
        System.out.println("The Total number of Count of "+givenNumber+" is "+count);
    }
    /*
     * Question 2 :Print out the sum of the numbers inthe second 
     * row of the “nums” array.Example :Input - 
     * int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };Output - 18
     */
    public static void printSumOfSecondRow(int matrix[][]){
        int sum =0 ;
        for (int i=0;i<matrix[1].length;i++){
            sum+=matrix[1][i] ;
        }
        System.out.println("The Sum of Second Row of the Matrix is :"+sum);
    }
    // Program for finding the transpose of the matrix ;
    public static void transposeMatrix(int matrix[][]) {
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[0].length;j++) {
                matrix[j][i]=matrix[i][j] ;
            }
        }
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    /* int matrix[][] ={
       {10,20,30,40},
       {15,25,35,45},
       {27,29,37,48},
       {32,33,39,50}
      };
      searchNumber(matrix,20) ;
       */ 

       /*
      int matrix[][]={
        {4,7,8},
        {8,8,7}
      };
      countNumber(matrix, 8);
       */
      int[][] nums = { {1,4,9},{11,4,3} };
      // printSumOfSecondRow(nums) ;
      transposeMatrix(nums) ;
      
    }
}
