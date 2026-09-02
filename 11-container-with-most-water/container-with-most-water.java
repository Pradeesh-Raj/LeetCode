class Solution {
    public int maxArea(int[] H) {
        int i = 0, j = H.length - 1;
        int max = -1;
        while(i < j) {
            int area = (j-i) * (Math.min(H[i], H[j]));
            max = Math.max(max, area);
            if(H[i] < H[j]) {
                i++;
            }
            else if(H[i] > H[j]) {
                j--;
            }
            else{
                i++;j--;
            } 
        }
        return max;
    }
}