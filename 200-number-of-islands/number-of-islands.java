class Solution {
    final int[][] diff = {
        {0, -1}, {-1, 0},
        {0, 1}, {1, 0}
    };
    public void dfs(char[][] grid, int R, int C, int row, int col) {
        grid[row][col] = '0';
        for(int i = 0 ; i < 4 ; i++) {
            int adjR = row + diff[i][0];
            int adjC = col + diff[i][1];
            if(adjR >= 0 && adjR < R && adjC >= 0 && adjC < C && (grid[adjR][adjC] == '1')) {
                dfs(grid, R, C, adjR, adjC);
            }
        }

    }
    public int numIslands(char[][] grid) {
        int islandsCount = 0;
        int R = grid.length;
        int C = grid[0].length;
        for(int i = 0 ; i < R ; i++) {
            for(int j = 0 ; j < C ; j++) {
                if(grid[i][j] == '1') {
                    islandsCount++;
                    dfs(grid, R, C, i, j);
                }
            }
        }
        return islandsCount;
    }
}