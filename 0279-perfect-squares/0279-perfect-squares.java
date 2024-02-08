// class Solution {
    
//     public int numSquares(int n) {
//         //Normal Recursion, will give time limit exceeded
// //         if(n==0){
// //             return 0;
// //         }
        
// //         int minCount=Integer.MAX_VALUE;
// //         for(int i=1;i*i<=n;i++){
// //             int result=1+numSquares(n-(i*i));
// //             minCount=Math.min(minCount,result);
// //         }
        
// //         return minCount;
        
        
//         // Using DP
//         int[] dp=new int[n+1];
//         Arrays.fill(dp,-1);
        
//         return minSquares(n,dp);
//     }
    
//     private int minSquares(int n,int[] dp){
//         if(n==0){
//             return 0;
//         }
        
//         if(dp[n]!=-1){
//             return dp[n];
//         }
        
//         int minCount=Integer.MAX_VALUE;
//         for(int i=1;i*i<=n;i++){
//             minCount=Math.min(minCount,numSquares(n-(i*i),dp)+1);
//         }
        
//         return dp[n]=minCount;
//     }
// }
public class Solution {
    private int[] t = new int[10001];

    private int minSquares(int n) {
        if (n == 0)
            return 0;

        if (t[n] != -1)
            return t[n];

        // We can select only those perfect squares which can contribute to sum up to n
        int minCount = Integer.MAX_VALUE;
        for (int i = 1; i * i <= n; i++) {
            minCount = Math.min(minCount, 1 + minSquares(n - i * i)); // 1 is for selecting one square number
        }

        return t[n] = minCount;
    }

    public int numSquares(int n) {
        Arrays.fill(t, -1);

        return minSquares(n);
    }
}
