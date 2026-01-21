class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, minLen = Integer.MAX_VALUE;
        int N = nums.length;
        int sum = 0;
        while(right < N){
            sum += nums[right];
            while(sum >= target){
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left++];
            }
            right++;
        }
        if(minLen == Integer.MAX_VALUE) return 0;
        return minLen;
    }
}