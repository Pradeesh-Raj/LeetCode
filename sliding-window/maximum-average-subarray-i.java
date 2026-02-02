class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int N = nums.length;
        if(N == 1){
            return (double)nums[0];
        }
        int left = 0, right = 0;
        double maxAvg = Double.NEGATIVE_INFINITY;
        long sum = 0;
        while(right < N){
            sum += nums[right];
            int len = right - left + 1;
            if(len > k){
                sum -= nums[left];
                left++;
                len--;
            }
            if(len == k){
                maxAvg = Math.max(maxAvg, (double)sum / k);
            }
            right++;
        }
        return maxAvg;
    }
}