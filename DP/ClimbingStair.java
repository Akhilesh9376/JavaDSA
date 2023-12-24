import java.util.Arrays;

public class ClimbingStair {
    // This is the Recursion Process T.C is 2^n
    public static int countWays(int n) {
        if(n==0) {
            return 1 ;
        }
        if(n<0) {
            return 0 ;
        }
        return countWays(n-1)+countWays(n-2) ;
    }

    // code for memoization 

    public static int countWays2(int n ,int ways[] ) {
        if(n==0) {
            return 1 ;
        }
        if(n<0) {
            return 0 ;
        }
        if(ways[n]!= -1 ) {
            return ways[n] ;
        }
        ways[n]=countWays2(n-1, ways) + countWays2(n-2, ways) ;
        return ways[n] ;
    }

    public static void main(String[] args) {
        int ans =countWays(5) ;
        System.out.println(ans);

        int n=5 ;
        int ways[]=new int[n+1] ;
        Arrays.fill(ways,-1);
        System.out.println(countWays2(n, ways));
    }
}
