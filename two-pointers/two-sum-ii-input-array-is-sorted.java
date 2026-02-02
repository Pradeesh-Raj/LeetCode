class Solution {
    public int[] twoSum(int[] nums, int target) {
        int N = nums.length;
        int low = 0, high = N - 1;
        while(low < high){
            int sum = nums[low] + nums[high];
            if(sum == target){
                return new int[]{low+1, high+1};
            }
            else if(sum > target){
                high--;
            }
            else low++;
        }
        return new int[]{-1,-1};
    }
}