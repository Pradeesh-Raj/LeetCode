class Solution {
    public static int solve(List<Integer> nums) {
        int N = nums.size();
        if(N == 1) return nums.get(0);
        int[] dp = new int[N];
        dp[0] = nums.get(0);
        dp[1] = Math.max(dp[0], nums.get(1));
        for(int i = 2 ; i < N ; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i-2] + nums.get(i));
        }
        return dp[N - 1];
    }

    public int rob(int[] nums) {
        int N = nums.length;
        if(N == 1) return nums[0];
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        for(int i = 0 ; i < N ; i++) {
            if(i != 0) arr1.add(nums[i]);
            if(i != N - 1) arr2.add(nums[i]);
        }
        return Math.max(solve(arr1), solve(arr2));
    }
}