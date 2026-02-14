class Solution {
    public int maxDistinct(String s) {
        int[] hash = new int[26];
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            if(hash[s.charAt(i) - 'a'] != 1) {
                hash[s.charAt(i) - 'a'] = 1;
                count++;
            }
        }
        return count;
    }
}