import javax.jws.soap.SOAPBinding;

/**
 *
 */
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n-1];
        if(n<=2) return n;
        dp[0] = 1;
        dp[1] = 2;
        for(int i=2;i<n;i++){
            dp[i] = dp[i-1] + dp[i-2] + 3;
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.climbStairs(3);
    }
}
