class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int target_ = 0;
        for(int i=0;i<numbers.length;i++){
            target_ = target - numbers[i];
            int left = 0;
            int right = numbers.length - 1;
            while(left<right){
                int mid = left + 1 + (right - left) / 2;
                if(numbers[mid] > target_){
                    right = mid-1;
                }else{
                    left = mid;
                }
            }
            if(left==i) continue;
            if(numbers[left]==target_){
                return new int[]{i+1,left+1};
            }
        }
        return new int[]{0,0};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {2,3,4};
        int tar = 6;
        int[] res = solution.twoSum(numbers,tar);
    }
}