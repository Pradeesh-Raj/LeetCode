class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int N = nums.length;
        int[] minArr = new int[N+1];
        Arrays.fill(minArr, Integer.MAX_VALUE);
        for(int i = N-1 ; i >= 0 ; i--) {
            minArr[i] = Math.min(minArr[i+1], nums[i]);
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < N ; i++) {
            max = Math.max(max, nums[i]);
            int score = max - minArr[i];
            if(score <= k) return i;
        }
        return -1;

    }
}