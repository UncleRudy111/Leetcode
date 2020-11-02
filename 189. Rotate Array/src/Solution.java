class Solution {
    public void rotate(int[] nums, int k) {
        int l=nums.length;
//        k = k % l;
        int j=0;
        int a=k;
        int c=k;
        int t;
        int[] b = nums.clone();
        for (int i=0;i<k;i++)
        {
            nums[j]=nums[l-a];
            a--;
            j++;
        }
        for (int i=0;i<k;i++)
        {
            nums[c]=b[i];
            c++;
        }
    }
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = {1};
        int val = 1;
        solution.rotate(nums,val);
    }
}