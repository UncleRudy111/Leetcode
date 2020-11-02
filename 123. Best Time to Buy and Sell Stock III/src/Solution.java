import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        List<Integer> list = new ArrayList<>();
        int seq_max = 0;
        for(int i=1;i<len;i++){
            if(prices[i] > prices[i-1]){
                seq_max += prices[i] - prices[i-1];
            }else{
                list.add(seq_max);
                seq_max = 0;
            }
        }
        list.add(seq_max);
        if(list.size() == 1){
            return list.get(0);
        }
        Collections.sort(list);
        return list.get(list.size()-1)+list.get(list.size()-2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {3,3,5,0,0,3,1,4};
        solution.maxProfit(prices);
    }
}