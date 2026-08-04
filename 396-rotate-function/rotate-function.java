class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum = 0, N = nums.length;
        long fnVal = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            sum += nums[i];
            fnVal += (nums[i] * i);
        }
        long max = fnVal;
        for(int j = N - 1 ; j > 0 ; j--) {
            fnVal = fnVal - (nums[j] * (N-1)) + (sum - nums[j]);
            max = Math.max(max, fnVal);
        }
        return (int)max;
    }
}