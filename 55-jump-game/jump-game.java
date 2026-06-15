class Solution {
    public boolean helper(int[] nums, int index, int N, int[] dp) {
        if(index >= N) return true;

        if(dp[index] != -1) return dp[index] == 1;

        for(int i = 1 ; i <= nums[index] ; i++) {
            if(helper(nums, index + i, N, dp)){
                dp[index] = 1;
                return true;
            } 
        }

        dp[index] = 0;
        return false;
    }
    public boolean canJump(int[] nums) {
        int N = nums.length;
        if(N == 1) return true;
        int[] dp = new int[N];
        Arrays.fill(dp, -1);
        return helper(nums, 0, N - 1, dp);
    }
}