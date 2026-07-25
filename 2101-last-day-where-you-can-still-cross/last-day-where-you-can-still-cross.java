class Solution {
    static final int[][] diff = {
        {-1,-1}, {-1,0}, {-1, 1},
        {0, -1}, {0, 1},
        {1,-1}, {1,0}, {1,1}
    };

    private static int gci(int row, int col, int C) {
        return row * C + col + 1;
    }

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

    public int latestDayToCross(int R, int C, int[][] cells) {
        int[] leader = new int[R * C + 2];
        boolean[] water = new boolean[R * C + 2];
        for(int i = 0 ; i < R * C + 2 ; i++) leader[i] = i;
        int days = 0;
        for(int[] cell : cells) {
            int row = cell[0], col = cell[1];
            row--; col--;
            water[gci(row, col, C)] = true;
            for(int i = 0 ; i < 8 ; i++) {
                int adjR = row + diff[i][0];
                int adjC = col + diff[i][1];
                if(adjR >= 0 && adjR < R && adjC >= 0 && adjC < C && (water[gci(adjR, adjC, C)])) {
                    join(leader, gci(row, col, C), gci(adjR, adjC, C));
                }
            }
            if(col == 0) {
                join(leader, 0, gci(row, col, C));
            }
            else if(col == C - 1) {
                join(leader, gci(row, col, C), R * C + 1);
            }
            if(find(leader, 0) == find(leader, R * C + 1)) {
                break;
            }
            days++;
        }
        return days;
    }
}