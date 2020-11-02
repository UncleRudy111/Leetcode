class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int a = left;
        int b = right;
        int max = 0;
        while(a < b){
            if(help(a,right,height) > help(left,right,height)){
                left = a;
            }
            a++;
            if(a >= b) break;
            if(help(left,b,height) > help(left,right,height)){
                right = b;
            }
            b--;
            if(a >= b) break;
        }
        return help(left,right,height);
    }

    public int help(int a,int b,int[] height){
        return (b - a) * Math.min(height[b],height[a]);
    }

    public static void main(String[] args) {
        Solution solution  = new Solution();
        int[] height = {2,3,4,5,18,17,6};
        solution.maxArea(height);
    }
}