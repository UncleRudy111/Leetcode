class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int middle = (left + right)>>1;
        while(left<right){
            if(nums[middle] < target){
                left = middle + 1;
            }else{
                right = middle;
            }
            middle = (left + right)>>1;
        }
        return nums[right]==target?right:right-1;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        Solution solution = new Solution();
        int res = solution.searchInsert(nums,target);
        System.out.println(res);
    }
}