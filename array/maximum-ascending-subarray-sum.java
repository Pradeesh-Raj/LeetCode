class Solution {
    public int maxAscendingSum(int[] nums) {
        int j = 1;
        int maxSum = nums[0];
        int sum = nums[0];
        while(j < nums.length) {
            if(nums[j] <= nums[j-1]) {
                sum = nums[j];
            }
            else {
                sum += nums[j];
            }
            maxSum = Math.max(maxSum,sum);
            j++;
        }
        return maxSum;
    }
}