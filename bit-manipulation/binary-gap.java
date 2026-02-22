class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int i = -1, j = 0;
        int dist = 0;
        while(j < binary.length()) {
            if(binary.charAt(j) == '1') {
                if(i != -1) {
                    dist = Math.max(dist, j-i);
                }
                i=j;
            }
            j++;
        }
        return dist;
    }
}