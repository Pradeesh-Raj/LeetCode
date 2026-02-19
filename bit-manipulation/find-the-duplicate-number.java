class Solution {
    public int findDuplicate(int[] nums) {
        int[] hash = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++) {
            hash[nums[i]]++;
            if(hash[nums[i]] > 1) return nums[i];
        }
        return -1;
    }
}