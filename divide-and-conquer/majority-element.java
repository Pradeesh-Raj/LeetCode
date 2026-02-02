class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = Integer.MIN_VALUE, N = nums.length;
        for(int i = 0 ; i < N ; i++){
            if(count == 0){
                count = 1;
                element = nums[i];
            }
            else if(nums[i] == element){
                count++;
            }
            else{
                count--;
            }
        }
        return element;
    }
}