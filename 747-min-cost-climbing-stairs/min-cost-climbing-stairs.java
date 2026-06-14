class Solution {
    private static int minCost(int[] cost, int index, int[] dp) {
        if (index == 0 || index == 1) {
            return dp[index] = cost[index];
        }
        if(dp[index] != -1) return dp[index];
        return dp[index] = cost[index] + Math.min(minCost(cost, index - 1, dp), minCost(cost, index - 2, dp));
    }

    public int minCostClimbingStairs(int[] cost) {
        int N = cost.length;
        int[] dp = new int[N];
        Arrays.fill(dp, -1);
        return Math.min(minCost(cost, N - 1, dp), minCost(cost, N - 2, dp));
    }
}