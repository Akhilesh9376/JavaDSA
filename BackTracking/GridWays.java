package BackTracking;

public class GridWays {
    public static int countWays(int i,int j,int m,int n) {
        // Time Complexity is 2^(m+n)
        // Base Case 
        if (i==n-1  && j==m-1) {
            return 1 ;
        }else if (i==n || j==n) {
            return 0 ;
        }
        int w1=countWays(i+1, j, m, n) ;
        int w2=countWays(i, j+1, m, n) ;
        return w1+w2 ;
    }
    // program for the factorial of a number 
    public static int factorial(int n) {
        if (n==1) {
            return 1 ;
        }
        return n*factorial(n-1) ;
    }
    public static int countWays2(int n,int m) {
        // It's time complexity is O(m+n)
        int ans =factorial(n-1+m-1)/(factorial(n-1)*factorial(m-1)) ;
        return ans ;
    }
    public static void main (String args[]) {
        int n=3,m=3 ;
        System.out.println(countWays(0,0, m, n));
        System.out.println(countWays2(n, m));

    }
}
