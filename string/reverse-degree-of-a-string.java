class Solution {
    public int reverseDegree(String s) {
        int degree = 0;
        for(int i = 1 ; i <= s.length() ; i++){
            char charAtPos = s.charAt(i-1);
            degree += (('z' - charAtPos) + 1) * i;
        }
        return degree;
    }
}