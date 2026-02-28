class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        if((coordinate2.charAt(0) - coordinate1.charAt(0)) % 2 == 0 && (coordinate2.charAt(1) - coordinate1.charAt(1)) % 2 == 0 ) {
            return true;
        }
        return false;
    }
}