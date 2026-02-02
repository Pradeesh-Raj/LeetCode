class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count,max;
        count = max = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1){
                count++;
                max = Math.max(max,count);
            }
            else{
                count = 0;
            }
        }
        return max;
    }
}