class Solution {
    public int countServers(int[][] grid) {
        int R = grid.length;
        int C = grid[0].length;
        int[] rows = new int[R];
        int[] cols = new int[C];
        for(int row = 0 ; row < R ; row++) {
            for(int col = 0 ; col < C ; col++) {
                if(grid[row][col] == 1) {
                    rows[row]++;
                    cols[col]++;
                }
            }
        }
        int count = 0;
        for(int i = 0 ; i < R ; i++) {
            for(int j = 0 ; j < C ; j++) {
                if(grid[i][j] == 1 && (rows[i] > 1 || cols[j] > 1)) {
                    count++;
                }
            }
        }
        return count;
    }
}