import java.util.Arrays;

public class ZeroOneKnapsack {
    // By Using Recursion 
    public static int knapSack(int [] val,int[] wt,int W,int n )  {
        if(W==0 || n==wt.length) {
            return 0 ;
        }

        if(wt[n]<=W) {
            // valid condition 
            int ans1 = val[n] + knapSack(val, wt, W-wt[n], n+1) ;

            // exclude 

            int ans2=knapSack(val, wt, W, n+1) ;

            return Math.max(ans1, ans2) ;
        }else {
            return knapSack(val, wt, W, n+1) ;
        }
    }
    // Solving with the help of memoization 
    public static int knapSackdp(int [] val,int[] wt,int W,int n,int[][] dp )  {
        if(W==0 || n==wt.length) {
            return 0 ;
        }

        if(dp[n][W] != -1 ) {
            return dp[n][W] ;
        }
        if(wt[n]<=W) {
            // valid condition 
            int ans1 = val[n] + knapSackdp(val, wt, W-wt[n], n+1,dp) ;

            // exclude 

            int ans2=knapSackdp(val, wt, W, n+1,dp) ;

            dp[n][W]= Math.max(ans1, ans2) ;
            return dp[n][W] ;
        }else {
            dp[n][W]= knapSackdp(val, wt, W, n+1,dp) ;
            return dp[n][W] ;
        }
    }
    
    // Code For Tabular DP
    public static int knapSackTab(int[] val,int[] wt,int W) {
        int n= val.length ;
        int[][] dp = new int[n+1][W+1] ;
        for (int i=0;i<dp.length;i++) {  // Oth Col
            dp[i][0]= 0 ;
        }
        for(int j=0;j<dp.length;j++) { // Oth Row 
            dp[0][j]= 0 ;
        }
        
        for(int i=1;i<n+1;i++) {
            for(int j=1;j<W+1;j++) {
                int v = val[i-1] ; // ith Item ki value 
                int w = wt[i-1] ;  // ith Item weight 
                if(w<=j) {
                    int incProfit= v+dp[i-1][j-w] ;
                    int excProfit= dp[i-1][j] ;
                    dp[i][j]=Math.max(incProfit,excProfit) ;
                }else{
                    int excProfit= dp[i-1][j] ;
                    dp[i][j]=execProfit ;
                }
            }
        }
        return dp[n][W] ;
    }
    
    public static void main(String[] args) {
        int[] val={15,14,10,45,30};
        int[] wt ={2,5,1,3,4};

        int W=7 ;
        int dp[][]=new int[val.length+1][W+1] ;
        for(int[] row:dp) {
            Arrays.fill(row,-1);
        }
        
        // System.out.println(dp[1][1]);
        // int ans =knapSack(val, wt, W, 0) ; 
        // int n=dp.length ;
        int ans=knapSackdp(val, wt, W, 0,dp) ;
        // System.out.println(ans+" "+" Ans");
        System.out.println(ans);

    }
}
