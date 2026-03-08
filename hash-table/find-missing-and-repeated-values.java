class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int N = grid.length;
        int[] hash = new int[N*N+1];
        int[] res = new int[2];
        for(int i = 0 ; i < N ; i++) {
            for(int j = 0 ; j < N ; j++) {
                if(++hash[grid[i][j]] > 1) res[0] = grid[i][j];
            }
        }
        for(int i = 1 ; i < hash.length ; i++) {
            if(hash[i] == 0) res[1] = i;
        }
        return res;
    }
}