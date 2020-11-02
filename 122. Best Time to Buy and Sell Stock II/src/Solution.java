class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int res = 0;
        int start = 1;
        while(start < len-1){
            int index = 0;
            int cur_max = 0;
            int max = 0;
            for(int i=start;i<len;i++){
                cur_max = Math.max(0,cur_max += prices[i]-prices[i-1]);
                if(cur_max > max){
                    max = cur_max;
                    index = i;
                }
            }
            res += max;
            start = index + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {7,1,5,3,6,4};
        solution.maxProfit(prices);
    }
}