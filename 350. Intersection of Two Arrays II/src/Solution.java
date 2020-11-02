import java.util.*;

/**
 *
 */
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mymap = new HashMap<>();
        for(Integer i:nums1){
            mymap.put(i,mymap.getOrDefault(i,0)+1);
        }
        List<Integer> mylist = new ArrayList<>();
        for(Integer i:nums2){
            if(mymap.containsKey(i)){
                if(mymap.get(i)>0){
                    mylist.add(i);
                    mymap.put(i,mymap.get(i)-1);
                }
            }
        }
        int res[] = new int[mylist.size()];
        int i=0;
        for(int a:mylist)
        {
            res[i++]=a;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {1,2,2};
        Solution solution  = new Solution();
        solution.intersect(nums1,nums2);
    }
}
