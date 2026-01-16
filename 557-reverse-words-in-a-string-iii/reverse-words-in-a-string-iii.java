class Solution {
    private static int findSpace(StringBuilder s, int j){
        while(j < s.length() && s.charAt(j) != ' ') j++;
        return j;
    }
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
        int i = 0, j = findSpace(str,0);
        int N = s.length();
        while(j <= N){
            reverse(str,i,j-1);
            i = j + 1;
            j = findSpace(str,++j);
        }
        return str.toString();
    }
}