/**
 *
 */
class Solution {
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        if(nums[left] < nums[right]) return nums[left];

        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[left]<nums[mid]) left = mid+1;
            else right = mid;
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int res = findMin(nums);
    }
}
