class Solution {
    public int[] decrypt(int[] code, int k) {
        int N = code.length;
        int[] result = new int[N];
        int i = 0;
        if(k == 0){
            return result;
        }
        else if(k > 0){
            while(i < N){
                int j = (i+1) % N;
                int len = 1;
                int sum = 0;
                while(len <= k){
                    sum += code[j % N];
                    j++;
                    len++;
                }
                result[i++] = sum;
            }
        }
        else{
            while(i < N){
                int j = (N + i - 1) % N;
                int len = 1;
                int sum = 0;
                while(len <= Math.abs(k)){
                    sum += code[(j + N) % N];
                    j--;
                    len++;
                }
                result[i++] = sum;
            }
        }
        return result;
    }
}