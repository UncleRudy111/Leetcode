/**
 *
 */
class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        if(nums.length == 3) return Math.max(nums[0]+nums[2],nums[1]);
        dp[0] = nums[0];
        dp[1] = nums[1];
        dp[2] = nums[2] + nums[0];
        int res = Math.max(dp[2],dp[1]);
        for(int i=3;i<nums.length;i++){
            dp[i] = nums[i] + Math.max(dp[i-2],dp[i-3]);
            if(res<dp[i]) res = dp[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,7,9,3,1};
        solution.rob(nums);
    }
}
