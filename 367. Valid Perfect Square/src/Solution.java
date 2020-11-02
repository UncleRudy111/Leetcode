
class Solution {
    public boolean isPerfectSquare(int number) {
        if(number==1) return true;
        if(number<=3) return false;
        long left = 1;
        long right = number;
        long multiply = 0;

        while(left<right){
            long mid = left+(right-left)/2;
            multiply = mid * mid;
            if((long)number == multiply){
                return true;
            }
            if((long)number > multiply){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return (long)number == multiply;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isPerfectSquare(5);
    }
}