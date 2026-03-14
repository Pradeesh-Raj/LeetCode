class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length, m = accounts[0].length;
        int maxWealth = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++) {
            int wealth = 0;
            for(int j = 0 ; j < m ; j++) {
                wealth+=accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, wealth);
        }
        return maxWealth;
    }
}