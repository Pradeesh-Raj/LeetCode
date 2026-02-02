class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int N = nums.length,index = 0;
        int[] hash = new int[N];
        int[] res = new int[2];
        for(int i = 0 ; i < N ; i++){
            hash[nums[i]]++;
        }
        for(int i = 0 ; i < N ; i++){
            if(hash[i] > 1){
                res[index++] = i;
            }
            if(index == 2) break;
        }
        return res;
    }
}