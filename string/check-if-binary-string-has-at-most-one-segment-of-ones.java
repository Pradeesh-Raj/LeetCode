class Solution {
    public boolean checkOnesSegment(String s) {
        boolean flag = false;
        for(int i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i) == '0') flag = true;
            else if(s.charAt(i) == '1' && flag) return false;
        }
        return true;
    }
}