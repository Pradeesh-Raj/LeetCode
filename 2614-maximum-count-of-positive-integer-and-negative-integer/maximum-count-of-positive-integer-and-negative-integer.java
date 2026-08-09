class Solution {
    public int lowerBound(int[] nums, int T) {
        int low = 0, high = nums.length-1;
        int ans = nums.length;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] >= T) {
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
    public int upperBound(int[] nums, int T) {
        int low = 0, high = nums.length-1;
        int ans = nums.length;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] > T) {
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }

    public int maximumCount(int[] nums) {
        int pos = (nums.length - upperBound(nums, 0));
        int neg = lowerBound(nums, 0);
        return Math.max(pos, neg);
    }
}