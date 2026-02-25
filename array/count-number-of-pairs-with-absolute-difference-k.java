class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            for(int j = i+1 ; j < nums.length ; j++) {
                int diff = nums[i] - nums[j];
                if(diff < 0) diff = -diff;
                if(diff == k) count++;
            }
        }
        return count;
    }
}