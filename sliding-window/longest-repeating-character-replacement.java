class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0, j = 0, maxLen = 0;
        int maxF = 0;
        int[] hash = new int[26];
        int N = s.length();
        while(j < N){
            hash[s.charAt(j) - 'A']+=1;
            maxF = Math.max(maxF, hash[s.charAt(j) - 'A']);
            if(((j-i+1) - maxF) > k){
                hash[s.charAt(i) - 'A']-=1;
                i++;
            }
            if(((j-i+1) - maxF) <= k){
                maxLen = Math.max(j-i+1, maxLen);
            }
            j++;
        }
        return maxLen;
    }
}