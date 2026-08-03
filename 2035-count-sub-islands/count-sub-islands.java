class Solution {
    final int[][] diff = {
            { 0, -1 }, { 0, 1 },
            { -1, 0 }, { 1, 0 }
    };
    boolean isSub;

    public void dfs(int[][] g1, int[][] g2, boolean[][] visited, int R, int C, int row, int col) {
        visited[row][col] = true;
        if (g1[row][col] != g2[row][col])
            isSub = false;
        for (int i = 0; i < 4; i++) {
            int adjR = row + diff[i][0];
            int adjC = col + diff[i][1];
            if (adjR >= 0 && adjR < R && adjC >= 0 && adjC < C && (g2[adjR][adjC] == 1 && !visited[adjR][adjC])) {
                dfs(g1, g2, visited, R, C, adjR, adjC);
            }
        }
    }

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int R = grid1.length, C = grid1[0].length;
        boolean[][] visited = new boolean[R][C];
        int count = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid2[i][j] == 1 && !visited[i][j]) {
                    isSub = true;
                    dfs(grid1, grid2, visited, R, C, i, j);
                    count += (isSub ? 1 : 0);
                }
            }
        }
        return count;
    }
}