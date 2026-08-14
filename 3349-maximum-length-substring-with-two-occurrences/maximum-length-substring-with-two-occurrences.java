class Solution {
    public int maximumLengthSubstring(String s) {
        int[] hash = new int[26];
        int i = 0, j = 0;
        int max = 0;
        while(j < s.length()) {
            hash[s.charAt(j) - 'a']++;
            while(hash[s.charAt(j) - 'a'] > 2) {
                hash[s.charAt(i) - 'a']--;
                i++;
            }
            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;
    }
}