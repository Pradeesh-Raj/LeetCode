class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max = (long)nums[0];
        long min = (long)nums[0];
        for(int i : nums) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        return (long)(max-min) * k;
        
    }
}