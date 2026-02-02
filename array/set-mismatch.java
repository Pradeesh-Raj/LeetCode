class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] hash = new int[nums.length + 1];
        for(int i = 1 ; i <= nums.length ; i++){
            hash[nums[i-1]] += 1;
        }
        int missing = 0;
        for(int i = 1 ; i < hash.length ; i++){
            if(hash[i] == 0){ 
                missing = i;
                break;
            }
        }
        for(int i = 1 ; i < hash.length ; i++){
            if(hash[i] == 2){
                return new int[]{i,missing};
            }
        }
        return new int[]{-1,-1};
    }
}