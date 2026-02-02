class Solution {
    public int minimumCost(int[] nums) {
        int minCost = nums[0];
        Arrays.sort(nums, 1, nums.length);
        minCost += nums[1] + nums[2];
        return minCost;
    }
}