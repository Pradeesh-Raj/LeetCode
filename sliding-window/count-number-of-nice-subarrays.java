class Solution {
    private static int subarray(int[] nums, int k) {
        int l = 0, r = 0, count = 0, cntK = 0;
        if(k < 0) return 0;
        int N = nums.length;
        while(r < N){
            if(nums[r] % 2 != 0) cntK++;
            while(cntK > k){
                if(nums[l] % 2 != 0) cntK--;
                l++;
            }
            count += r-l+1;
            r++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k){
        return subarray(nums, k) - subarray(nums, k-1);
    }
}