class Solution {
    private static void reverseChar(StringBuilder str, int start, int end){
        while(start < end){
            char temp = str.charAt(start);
            str.setCharAt(start, str.charAt(end));
            str.setCharAt(end, temp);
            start++;
            end--;
        }
    }
    public String reverseStr(String s, int k) {
        int N = s.length();
        StringBuilder str = new StringBuilder(s);
        if(N <= k){
            reverseChar(str,0,N-1);
            return str.toString();
        }
        int i = 0, j = k-1;
        while(i < N){
            reverseChar(str,i,j);
            i = i + 2*k;
            j = Math.min(i + k - 1, N-1);
        }
        return str.toString();
    }
}