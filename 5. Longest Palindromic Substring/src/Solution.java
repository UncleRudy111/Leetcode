/**
 *
 */
class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            dp[i][i] = true;
        }
        int start = 0;
        int end = 0;
        for(int i=1;i<s.length();i++){
            for(int j=0;j<i;j++){
                if(s.charAt(j)==s.charAt(i)){
                    if(i-j==1 || dp[j+1][i-1]){
                        dp[j][i] = true;
                        if(end-start<i-j){
                            start = j;
                            end = i;
                        }
                    }
                }else{
                    dp[j][i] = false;
                }
            }
        }
        return s.substring(start,end+1);
    }
}