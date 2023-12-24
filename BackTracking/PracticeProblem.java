package BackTracking;

public class PracticeProblem {
    // Rat Maze Problem 
    public static void printSolution(int sol[][]) {
        for (int i=0;i<sol.length;i++) {
            for (int j=0;j<sol.length;j++) {
                System.out.print(" "+sol[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean solveMaze(int maze[][]) {
        int N=maze.length ;
        int sol[][]=new int[N][N] ;

        if (solveMaze(maze))
    }
    public static void main (String[] args ) {

    }
}
