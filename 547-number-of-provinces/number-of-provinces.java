class Solution {
    public static int find(int[] leader, int node) {
        if(leader[node] != node) {
            leader[node] = find(leader, leader[node]);
        }
        return leader[node];
    }

    public static void join(int[] leader, int left, int right) {
        int leadL = find(leader, left);
        int leadR = find(leader, right);
        leader[leadR] =  leadL;
    }

    private static int gci(int row, int col, int C) {
        return row * C + col + 1;
    }

    public int findCircleNum(int[][] grid) {
        int N = grid.length;
        int[] leader = new int[N+1];
        for(int i = 1 ; i <= N ; i++) leader[i] = i;
        for(int i = 1 ; i <= N ; i++) {
            for(int j = i ; j <= N ; j++) {
                if(i != j && grid[i-1][j-1] == 1) {
                    join(leader, i, j);
                }
            }
        }
        int[] hash = new int[N+1];
        for(int i = 1 ; i <= N ; i++) {
            int ld = find(leader, i);
            if(hash[ld] != 1) hash[ld] = 1;
        }
        int count = 0;
        for(int i : hash) {
            count += (i != 0) ? 1 : 0;
        }
        return count;
    }
}