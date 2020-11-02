class Solution {
    public int trap(int[] height) {
        if(height.length <= 2) return 0;
        int wall = height[0];
        int max_h = 0;
        int res = 0;
        for(int i=0;i<height.length;i++){
            max_h = Math.max(max_h,height[i]);
            res -= height[i];
        }
        res += max_h*height.length;
        for(int i=0;i<height.length;i++){
            if(height[i] == max_h) break;
            if(height[i] <= wall){
                res -= max_h-wall;
            }else{
                wall = height[i];
                res -= max_h-wall;
            }
        }
        for(int i=height.length-1;i>=0;i--){
            if(height[i] == max_h) break;
            if(height[i] <= wall){
                res -= max_h-wall;
            }else{
                wall = height[i];
                res -= max_h-wall;
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
//        solution.trap(height);


        String str = "ak@QJ&pS&1&187581361xx,185xxxx,183xxx";
        String md5 = MD5.create().digestHex(str);
        System.out.println(md5);//29ecc0c795405c23c10167e58d1cb73c

    }
}