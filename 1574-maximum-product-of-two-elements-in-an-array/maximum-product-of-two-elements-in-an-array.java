class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int N = nums.length;
        return (nums[N-1] - 1) * (nums[N-2] - 1);
    }
}