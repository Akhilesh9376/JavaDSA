package BackTracking;

public class Nqueen {
    static int count =0 ;
    public static void printBoard(char[][] board) {
        System.out.println("********* Chess Board ***************");
        for (int i=0;i<board.length;i++) {
            for (int j=0;j<board.length;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println() ;
        }
    }

    public static boolean isSafe(char[][] board,int row ,int col ) {
        // Veetical Up 
        for(int i=row-1;i>=0;i--) {
            if(board[i][col]=='Q') {
                return false ;
            }
        }

        // diagonal left 
        for(int i=row-1,j=col-1;i>=0 && j>=0;j--,i--) {
            if (board[i][j]=='Q') {
                return false ;
        }
    }
        // diagonal right 

        for (int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++) {
            if (board[i][j]=='Q') {
                return false ;
            }
        }

        return true ;
    }
    public static void nQueen(char[][] board,int row) {
        // base 

        if (row==board.length) {
            printBoard(board) ;
            //count++ ;
        }
        // column loop 
        for(int j=0;j<board.length;j++) {
           if (isSafe(board, row, j)) {
            board[row][j]='Q' ;
            nQueen(board, row+1); // function calls 
            board[row][j]='X' ;   // Bactracking 
           }
        }
    }

    // Count ways of N-Queen
    // Count total number of ways in which we can solve N Questions Problems 
    public static void main (String args[]) {
            int n=5 ;
            char board[][]=new char[n][n] ;
            for(int i=0;i<n;i++) {
                for (int j=0;j<n;j++) {
                    board[i][j]='X' ;
            }
        }
        // Time Complexity of nQueen is O(n!)
        nQueen(board, 0);
        // System.out.println(Nqueen.count);
    }
}
