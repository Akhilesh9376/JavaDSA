package BackTracking;

public class SudokoSolever {
    public static void printSudoku(int sudoko[][]) {
        for (int i=0;i<sudoko.length;i++){
            for (int j=0;j<sudoko.length;j++) {
                System.out.print(sudoko[i][j]+" ");
            }
            System.out.println();
            }
    }
    public static boolean isSafe(int sudoko[][],int row,int col,int digit) {
        // columns 
        for (int i=0;i<=8;i++) {
            if(sudoko[i][col]==digit) {
                return false ;
            }
        }
        // rows 
        for (int i=0;i<=8;i++) {
            if (sudoko[row][i]==digit) {
                return false ;
            }
        }

        // Grid 
        int sr=(row/3)*3 ;
        int sc=(col/3)*3 ;

        for(int i=sr;i<sr+3;i++) {
            for (int j=sc;j<sc+3;j++) {
                if (sudoko[i][j]==digit) {
                    return false ;
                }
            }
        }

        return true ;
    }
    public static boolean sudokuSolver(int suduko[][],int row,int col){
        // base vase 
        if (row==9) {
            return true ;
        }
        int nextRow=row,nextCol=col+1 ;
        if(col+1==9) {
            nextRow=row+1 ;
            nextCol=0 ;
        }
        // recursion

        if (suduko[row][col]!=0) {
            return sudokuSolver(suduko, nextRow, nextCol) ;
        }
        for (int digit=1;digit<=9;digit++) {
            if(isSafe(suduko,row,col,digit)){
                suduko[row][col]=digit ;
                if (sudokuSolver(suduko, nextRow, nextCol)){
                        // if this function return true 
                        // it means solution exists
                        return true ;
                }
                suduko[row][col]= 0 ;
             }
        }
        return false ;
    }
    public static void main (String[] args ) {
        int sudoko[][]={
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
        };

        if (sudokuSolver(sudoko, 0, 0)) {
            System.out.println("Solution Exits");
            printSudoku(sudoko);
        }
    }
}
