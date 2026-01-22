class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int N = matrix.length;
        int M = matrix[0].length;
        for(int i = 1 ; i < N ; i++){
            for(int j = 1 ; j < M ; j++){
                if(matrix[i][j] != matrix[i-1][j-1]) return false;
            }
        }
        return true;
    }
}