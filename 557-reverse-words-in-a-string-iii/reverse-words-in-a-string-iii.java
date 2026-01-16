class Solution {
    private static void reverse(StringBuilder str, int st, int end){
        while(st < end){
            char temp = str.charAt(st);
            str.setCharAt(st, str.charAt(end));
            str.setCharAt(end, temp);
            st++;end--;
        }
    }
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder(s);
        int i = 0, j = 0;
        int N = s.length();
        while(j <= N){
            while(j < s.length() && s.charAt(j) != ' ') j++;
            reverse(str,i,j-1);
            i = j + 1;
            j = i;
        }
        return str.toString();
    }
}