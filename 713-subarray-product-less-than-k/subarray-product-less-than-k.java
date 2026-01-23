class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
        int left = 0, right = 0, count = 0;
        int N = nums.length;
        int prod = 1;
        while(right < N){
            prod *= nums[right];
            while(prod >= k){
                prod /= nums[left++];
            }
            count += (right - left + 1);
            right++;
        }
        return count;
    }
}