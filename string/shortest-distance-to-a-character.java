class Solution {
    private static int[] rightDistance(char[] chars, int N, int c){
        int[] right = new int[N];
        int i = 0, j = 0;
        while(i < N && j < N){
            if(chars[j] != c) j++;
            else{
                while(i <= j){
                    right[i] = j-i;
                    i++;
                }
                j++;
            }
        }
        if(j >= N && i < N){
            while(i<N){
                right[i++] = Integer.MAX_VALUE;
            }
        }
        return right;
    }

    private static int[] leftDistance(char[] chars, int N, int c){
        int[] left = new int[N];
        int i = N-1, j = N-1;
        while(i >= 0 && j >= 0){
            if(chars[j] != c) j--;
            else{
                while(i >= j){
                    left[i] = i-j;
                    i--;
                }
                j--;
            }
        }
        if(j < 0 && i >= 0){
            while(i>=0){
                left[i--] = Integer.MAX_VALUE;
            }
        }
        return left;
    }

    public int[] shortestToChar(String s, char c) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int[] left = leftDistance(chars, n, c);
        int[] right = rightDistance(chars, n, c);
        int[] res = new int[n];
        for(int i = 0 ; i < n ; i++){
            res[i] = Math.min(left[i], right[i]);
        }
        return res;
    }
}