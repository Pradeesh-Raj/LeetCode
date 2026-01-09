class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;
        int n = s.length();
        if(n == 0) return 0;
        int max = Integer.MIN_VALUE;
        int len = 1;
        Set<Character> set = new HashSet<>();
        while(j < n){
            if(set.add(s.charAt(j))){
                len = j - i + 1;
                max = Math.max(len,max);
                j++;
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}