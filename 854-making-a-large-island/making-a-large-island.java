class Solution {
    private HashMap<Integer, Integer> map = new HashMap<>();
    final int[][] diff = {
        {0, -1}, {-1, 0},
        {0, 1}, {1, 0}
    };
    private int max = Integer.MIN_VALUE;
    public void dfs(int[][] grid, int R, int C, int row, int col, int islandsCount) {
        grid[row][col] = islandsCount;
        for(int i = 0 ; i < 4 ; i++) {
            int adjR = row + diff[i][0];
            int adjC = col + diff[i][1];
            if(adjR >= 0 && adjR < R && adjC >= 0 && adjC < C && (grid[adjR][adjC] == 1)) {
                dfs(grid, R, C, adjR, adjC, islandsCount);
            }
        }
    }

    public void largestArea() {
        for(Map.Entry<Integer, Integer> mpp : map.entrySet()) {
            max = Math.max(max, mpp.getValue());
        }
    }

    public int numIslands(int[][] grid) {
        int islandsCount = 1;
        int R = grid.length;
        int C = grid[0].length;
        for(int i = 0 ; i < R ; i++) {
            for(int j = 0 ; j < C ; j++) {
                if(grid[i][j] == 1) {
                    islandsCount++;
                    dfs(grid, R, C, i, j, islandsCount);
                }
            }
        }
        return islandsCount;
    }

    public void isLandsValues(int[][] grid, int R, int C) {
        for(int i = 0 ; i < R ; i++) {
            for(int j = 0 ; j < C ; j++) {
                if(grid[i][j] != 0) {
                    map.put(grid[i][j], map.getOrDefault(grid[i][j],0) + 1);
                }
            }
        }
    }

    public void mergeIslands(int[][] grid, int R, int C, int islandCnt) {
        for(int i = 0 ; i < R ; i++) {
            for(int j = 0 ; j < C ; j++) {
                boolean[] islands = new boolean[islandCnt + 1];
                if(grid[i][j] == 0) {
                    int sum = 1;
                    for(int l = 0 ; l < 4 ; l++) {
                        int adjR = i + diff[l][0];
                        int adjC = j + diff[l][1];
                        if(adjR >= 0 && adjR < R && adjC >= 0 && adjC < C && grid[adjR][adjC] != 0) {
                            int neighbour = grid[adjR][adjC];
                            if(!islands[neighbour]) {
                                sum += map.get(neighbour);
                                islands[neighbour] = true;
                            }
                        }
                    }
                    max = Math.max(max, sum);
                }   
            }
        }
    }

    public int largestIsland(int[][] grid) {
        int R = grid.length;
        int C = grid[0].length;
        int islandCnt = numIslands(grid);
        isLandsValues(grid, R, C);
        largestArea();
        mergeIslands(grid, R, C, islandCnt);
        return max;
    }
}