import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    class Solution {
        public boolean wordPattern(String pattern, String str) {
            // 处理pattern
            Integer[] arr1 = new Integer[26];
            Integer[] number1 = new Integer[pattern.length()];

            Integer flag1 = 1;
            for(Integer i=0;i<pattern.length();i++){
                if(arr1[pattern.charAt(i)-'a'] == null){
                    arr1[pattern.charAt(i)-'a'] = flag1;
                    flag1++;
                }
            }
            for(Integer i=0;i<pattern.length();i++){
                number1[i] = arr1[pattern.charAt(i)-'a'];
            }

            //处理str
            List<String> temp = new ArrayList<>();
            Integer len = str.length();
            boolean haveWord = false;
            Integer word_start = 0;
            Integer word_end;
            String tmp_str = "";
            for(Integer i=0;i<len;i++){
                if(str.charAt(i)==' '){
                    if(haveWord){
                        word_end = i;
                        tmp_str = str.substring(word_start,word_end);
                        temp.add(tmp_str);
                        haveWord = false;
                    }
                }else if(str.charAt(i)!=' '){
                    if(!haveWord){
                        word_start = i;
                        haveWord = true;
                    }
                }

                if(i == str.length()-1 && haveWord){
                    tmp_str = str.substring(word_start);
                    temp.add(tmp_str);
                    break;
                }
            }
            Integer[] number2 = new Integer[temp.size()];
            List<String> temp2 = new ArrayList<>();
            Integer flag2 = 1;
            for(Integer i=0;i<temp.size();i++){
                if(!temp2.contains(temp.get(i))){
                    temp2.add(temp.get(i));
                    number2[i] = flag2;
                    flag2++;
                }else{
                    Integer index = temp2.indexOf(temp.get(i));
                    number2[i] = number2[index];
                }
            }
            if(pattern.length() != temp.size()) return false;
            for(Integer i=0;i<pattern.length();i++){
                if(number1[i] != number2[i]) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String pattern = "aaa";
        String str = "aa aa aa aa";
        solution.wordPattern(pattern,str);
    }
}