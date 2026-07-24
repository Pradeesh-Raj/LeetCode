class Solution {
    public int maxScore(String s) {
        int N = s.length();
        int onesCount = 0;
        for(int i = 0 ; i < N ; i++) {
            onesCount += (s.charAt(i) == '1') ? 1 : 0;
        }
        int leftZeros = 0;
        int max = 0;
        for(int i = 0 ; i < N - 1 ; i++) {
            char ch = s.charAt(i);
            if(ch == '0') leftZeros++;
            else onesCount--;
            max = Math.max(max, leftZeros + onesCount);
        }
        return max;
    }
}