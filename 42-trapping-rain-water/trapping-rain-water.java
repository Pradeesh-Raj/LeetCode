class Solution {
    public int trap(int[] height) {
        int N = height.length;
        int[] maxLeft = new int[N];
        int[] maxRight = new int[N];

        int max = -1;
        for(int i = 0 ; i < N ; i++) {
            max = Math.max(max, height[i]);
            maxLeft[i] = max;
        }
        max = -1;
        for(int i = N-1 ; i >= 0 ; i--) {
            max = Math.max(max, height[i]);
            maxRight[i] = max;
        }
        int totalWater = 0;
        for(int i = 0 ; i < N ; i++) {
            totalWater += Math.min(maxLeft[i], maxRight[i]) - height[i];
        }
        return totalWater;
    }
}