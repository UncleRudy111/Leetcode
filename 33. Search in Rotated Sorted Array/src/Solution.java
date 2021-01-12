/**
 *
 */
class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len-1;

        int res = -1;

        if(nums[0] <= nums[len-1]){
            for(int i=0;i<len;i++){
                if(target == nums[i]) res = i;
            }
            return res;
        }

        int mid = 0;
        while(left < right){
            mid = (left+right)/2;
            if(nums[left] < nums[mid]) left = mid;
            else right = mid-1;
        }

        if(target>=nums[0]){
            for(int i=0;i<=left+1;i++){
                if(target == nums[i]) res = i;
            }
        }else{
            for(int i=left+1;i<len;i++){
                if(target == nums[i]) res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4,5,6,7,8,1,2,3};
        int target = 8;
        int res = solution.search(nums, target);
    }
}
