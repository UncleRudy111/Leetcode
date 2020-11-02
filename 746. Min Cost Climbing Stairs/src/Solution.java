
/**
 *
 */
public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length == 1){
            return cost[0];
        }
        if(cost.length == 2){
            return Math.min(cost[1],cost[0]);
        }

        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = Math.min(cost[1],cost[0]);
        for(int i=2;i<cost.length;i++){
            dp[i] = Math.min(dp[i-1],dp[i-2]) + cost[i];
        }
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] cost = {0,1,1,0};
        solution.minCostClimbingStairs(cost);
    }
}