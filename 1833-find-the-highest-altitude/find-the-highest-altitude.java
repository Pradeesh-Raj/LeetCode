class Solution {
    public int largestAltitude(int[] gain) {
        int highest = 0, start = 0;
        for(int i = 0 ; i < gain.length ; i++) {
            highest = Math.max(highest, start + gain[i]);
            start += gain[i];
        }
        return highest;
    }
}