class Solution {
    final int[][] diff = {
        {0, -1}, {0, 1},
        {-1, 0}, {1, 0}
    };

    public void dfs(int[][] grid, boolean[][] visited, int R, int C, int row, int col, int color, int originC) {
        visited[row][col] = true;
        grid[row][col] = color;
        for(int i = 0 ; i < 4 ; i++) {
            int adjR = row + diff[i][0];
            int adjC = col + diff[i][1];
            if(adjR >= 0 && adjR < R && adjC >= 0 && adjC < C && !visited[adjR][adjC] && grid[adjR][adjC] == originC) {
                dfs(grid, visited, R, C, adjR, adjC, color, originC);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int R = image.length;
        int C = image[0].length;
        boolean[][] visited = new boolean[R][C];
        dfs(image, visited, R, C, sr, sc, color, image[sr][sc]);
        return image;
    }
}