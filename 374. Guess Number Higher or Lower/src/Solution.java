/**
 *
 */
public class Solution {
    private static int pick_s = 6;

    private int guess(int pick){
        return Integer.compare(pick, pick_s);
    }

    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while(left<right){
            int mid = left+(right-left)/2;
            if(guess(mid) == 0){
                return mid;
            }

            if(guess(mid) == -1){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = solution.guessNumber(10);
        System.out.println(res);
    }
}
