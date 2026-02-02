class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for(int i = 0 ; i <= s.length() - 2 ; i++){
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return score;
    }
}