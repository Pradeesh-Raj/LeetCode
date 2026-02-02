class Solution {
    private static int colMax(int[][] mat, int n, int col){
        int row = 0;
        int max_element = mat[row][col];
        for(int i = 1 ; i < n ; i++){
            if(mat[i][col] > max_element){
                max_element = mat[i][col];
                row = i;
            }
        }
        return row;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int low = 0, high = m-1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int row = colMax(mat, n, mid);
            int left = (mid - 1 >= 0) ? mat[row][mid-1] : -1;
            int right = (mid + 1 < m) ? mat[row][mid+1] : -1;
            if(mat[row][mid] > left && mat[row][mid] > right){
                return new int[]{row,mid};
            }
            else if(mat[row][mid] < left) high = mid - 1;
            else low = mid + 1;
        }
        return new int[]{-1,-1};
    }
}