import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    // "the sky is blue"
    public String reverseWords(String s) {
        List<String> temp = new ArrayList<>();
        boolean haveWord = false;
        int len = s.length();
        int word_start = 0;
        int word_end;
        String tmp_str = "";
        for(int i=0;i<len;i++){
            if(s.charAt(i)==' '){
                if(haveWord){
                    word_end = i;
                    tmp_str = s.substring(word_start,word_end);
                    temp.add(tmp_str);
                    haveWord = false;
                }
            }else if(s.charAt(i)!=' '){
                if(!haveWord){
                    word_start = i;
                    haveWord = true;
                }
            }

            if(i == s.length()-1 && haveWord){
                tmp_str = s.substring(word_start);
                temp.add(tmp_str);
                break;
            }
        }
        if(temp.isEmpty()){
            return "";
        }
        Collections.reverse(temp);
        String res = temp.get(0);
        for(int i=1;i<temp.size();i++){
            res = res.concat(" ");
            res = res.concat(temp.get(i));
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String test = "the sky is blue";
        String res = solution.reverseWords(test);
        System.out.println(res);
    }
}