class Solution {
    public String reversePrefix(String s, int k) {
        if(k == 1) return s;
        char[] chars = s.toCharArray();
        for(int i = 0 ; i < k/2 ; i++){
            char temp = chars[i];
            chars[i] = chars[k-i-1];
            chars[k-i-1] = temp;
        }
        return new String(chars);
    }
}