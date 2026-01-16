class Solution {
    private static void reverse(char[] str, int st, int end){
        while(st < end){
            char temp = str[st];
            str[st] = str[end];
            str[end] = temp;
            st++;end--;
        }
    }
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = 0;
        int N = chars.length;
        while(i < N - 1){
            while(j < N && chars[j] != ' ') j++;
            reverse(chars,i,j-1);
            i = j + 1;
            j = i;
        }
        return new String(chars);
    }
}