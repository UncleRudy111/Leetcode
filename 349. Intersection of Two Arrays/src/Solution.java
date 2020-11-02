import java.util.HashSet;

/**
 *
 */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> mySet = new HashSet<>();

        for (int tar : nums1) {
            int left = 0;
            int right = nums2.length - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums2[mid] == tar) {
                    mySet.add(nums2[mid]);
                    break;
                } else if (nums2[mid] < tar) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
        }
        int[] res = new int[mySet.size()];
        int index = 0;
        for(Integer i : mySet){
            res[index++] = i;
        }
        return res;
    }
}
