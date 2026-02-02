class Solution {
    public int findKthPositive(int[] nums, int k) {
        int N = nums.length;
        int low = 0, high = N - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int missing = nums[mid] - (mid + 1);
            if(missing < k){
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return low + k;
    }
}