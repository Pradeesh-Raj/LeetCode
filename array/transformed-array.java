class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int N = nums.length;
        int[] result = new int[N];
        for(int i = 0 ; i < N ; i++){
            if(nums[i] > 0){
                result[i] = nums[(i + nums[i]) % N];
            }
            else if(nums[i] < 0){
                result[i] = nums[(i + nums[i] % N + N) % N];
            }
            else result[i] = nums[i];
        }
        return result;
    }
}