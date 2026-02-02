class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, N = nums.length;
        int maxLen = 0, zeros = 0;
        while(right < N){
            if(nums[right] == 0) zeros++;
            if(zeros > k){
                if(nums[left] == 0) zeros--;
                left++;
            }
            if(zeros <= k){
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
        }
        return maxLen;
    }
}