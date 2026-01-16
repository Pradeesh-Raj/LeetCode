class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        Arrays.fill(hash,-1);
        int left = 0, right = 0, maxLen = 0;
        int N = s.length();
        while(right < N){
            if(hash[s.charAt(right)] != -1){
                if(hash[s.charAt(right)] >= left){
                    left = hash[s.charAt(right)] + 1;
                }
            }
            int len = right - left + 1;
            maxLen = Math.max(maxLen, len);
            hash[s.charAt(right)] = right++;
        }
        return maxLen;
    }
}