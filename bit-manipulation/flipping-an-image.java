class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int N = image.length;
        for(int i = 0 ; i < N ; i++) {
            int left = 0, right = N-1;
            while(left <= right) {
                int temp = image[i][left] ^ 1;
                image[i][left] = image[i][right] ^ 1;
                image[i][right] = temp;
                left++; right--;
            }
        }
        return image;
    }
}