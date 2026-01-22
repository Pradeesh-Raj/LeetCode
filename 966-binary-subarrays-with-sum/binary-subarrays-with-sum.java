class Solution {
    private static int sumLess(int[] nums, int goal) {
        if(goal < 0) return 0;
        int i = 0, j = 0, count = 0, sum = 0;
        int N = nums.length;
        while(j < N){
            sum += nums[j];
            while(sum > goal){
                sum -= nums[i++];
            }
            count += j - i + 1;
            j++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal){
        return sumLess(nums,goal) - sumLess(nums, goal-1);
    }
}