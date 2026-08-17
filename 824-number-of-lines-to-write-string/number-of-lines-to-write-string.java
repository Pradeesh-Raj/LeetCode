class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lineCount = 1;
        int pixels = 0;
        for(int i = 0 ; i < s.length() ;) {
            pixels += widths[s.charAt(i) - 'a'];
            if(pixels > 100) {
                lineCount++;
                pixels = 0;
            }
            else i++;
        }
        return new int[]{lineCount, pixels};
    }
}