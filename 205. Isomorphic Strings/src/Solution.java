class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] arr1 = new int[128];
        int[] number1 = new int[s.length()];
        int[] arr2 = new int[128];
        int[] number2 = new int[s.length()];

        int flag1 = 1;
        int flag2 = 1;
        for(int i=0;i<s.length();i++){
            arr1[Integer.valueOf(s.charAt(i))] = flag1;
            flag1++;
            arr2[Integer.valueOf(t.charAt(i))] = flag2;
            flag2++;
        }

        

        for(int i=0;i<s.length();i++){
            number1[i] = arr1[Integer.valueOf(s.charAt(i))];
            number2[i] = arr2[Integer.valueOf(t.charAt(i))];
        }



        for(int i=0;i<s.length();i++){
            if(number1[i] != number2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "paper";
        String t = "title";
    }
}