class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posIndex = 0 , negIndex = 1;
        int[] result = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < 0){
                result[negIndex] = nums[i];
                negIndex+=2;
            } 
            else{
                result[posIndex] = nums[i];
                posIndex+=2;
            }
        }
        return result;
    }
}