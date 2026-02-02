class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int N = nums.length;
        int[] count = new int[N];
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if(nums[j] < nums[i]){
                    count[i] += 1;
                }
            }
        }
        return count;
    }
}