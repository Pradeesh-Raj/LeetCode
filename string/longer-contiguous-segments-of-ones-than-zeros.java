class Solution {
    public boolean checkZeroOnes(String s) {
        int count1s = 0, count0s = 0;
        int maxCount1 = 0, maxCount0 = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i) == '1') {
                count0s = 0;
                count1s++;
                maxCount1 = Math.max(maxCount1, count1s);
            }
            else {
                count1s = 0;
                count0s++;
                maxCount0 = Math.max(maxCount0, count0s);
            }
        }
        // if(maxCount0 == maxCount1) return false;
        return ((maxCount0 >= maxCount1) ? false : true);
    }
}