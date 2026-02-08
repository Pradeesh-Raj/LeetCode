class Solution {
    public int countSegments(String s) {
        if(s.length() == 0) return 0;
        return s.split(" ").length;
    }
}