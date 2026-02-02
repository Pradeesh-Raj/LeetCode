class Solution {
    public int maxScore(int[] nums, int k) {
        int N = nums.length;
        int lSum = 0, rSum = 0, maxSum = 0;
        for(int i = 0 ; i < k ; i++){
            lSum += nums[i];
        }
        maxSum = lSum;
        int rIndex = N - 1;
        for(int i = k-1 ; i >= 0 ; i--){
            lSum -= nums[i];
            rSum += nums[rIndex--];
            maxSum = Math.max(maxSum, lSum+rSum);
        }
        return maxSum;
    }
}