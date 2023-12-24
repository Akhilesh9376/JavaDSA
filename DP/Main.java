/*
 * D.P is optimized recursion 
 * How to Identify D.P 
 * a) Optimal Problem
 * b) SOme choice is given (multiple branches in recursion tree )
 * 
 * Dynamic Programming is a technique in computer programming 
 * that helps to efficiently solve a class of problems that have overlapping
 * subproblems and optimal substructure 
 * property 
 */

 /*
  * Ways Of D.P 
   1. Memorization(Top Down ) 
    a) D.P can be solved by Recursion 
    b) subproblems-storage -reuse 
   2. Tabulation(Bottom Up )
   a) Problems can be solved by using iteration 
  */

  /*
   * 7 Important D.P Question 
   *    1. Fibonacci 
   *    2. 0-1 Knapsack 
   *    3. Unbounded Knapsack 
   *    4. LCS(Lowest Common Subsequences ) 
   *    5. Kadane Algo (Array) 
   *    6. Catalan Number 
   *    7. D.P On Grid (2-D Array)
   */
public class Main {
    public static int fib(int n,int [] f) {  // T.C linear 
        if(n==0 || n==1) {
            return n ;
        }
        if(f[n]!=0) {
            return f[n] ;
        }
        f[n]=fib(n-1, f)+fib(n-2, f) ;

        return f[n] ;

    }
    public static void main(String[] args) {
        int n=5 ;
        int f[]=new int[n+1] ; // By Default Initialise with 0 Value 
        fib(n,f);

        System.out.println(fib(n, f));
    }
}