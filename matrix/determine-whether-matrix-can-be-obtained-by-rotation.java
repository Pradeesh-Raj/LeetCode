class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int maxRotations = 3;
        int i = 0,n = mat.length;
        if(Arrays.deepEquals(mat,target)){
            return true;
        }
        while(i < maxRotations){
            for(int k = 0 ; k < n ; k++){
                for(int l = k+1 ; l < n ; l++){
                    int temp = mat[k][l];
                    mat[k][l] = mat[l][k];
                    mat[l][k] = temp;
                }
            }
            for(int j = 0 ; j < n ; j++){
                int left = 0,right = n - 1;
                while(left < right){
                    int temp = mat[j][left];
                    mat[j][left] = mat[j][right];
                    mat[j][right] = temp;
                    left++;right--;
                }
            }
            if(Arrays.deepEquals(mat,target)){
                return true;
            }
            i++;
        }
        return false;
    }
}