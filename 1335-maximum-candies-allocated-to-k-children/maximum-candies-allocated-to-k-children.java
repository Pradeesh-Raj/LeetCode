class Solution {
    public static int max(int[] nums){
        int max = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            max = Math.max(max,nums[i]);
        }
        return max;
    }

    public boolean can(int[] arr, int CPC, long k) {
        long children = 0;
        for(int i : arr) {
            children += (i / CPC);
        }
        if(children >= k) return true;
        return false;
    }

    public int maximumCandies(int[] candies, long k) {
        int low = 1, high = max(candies);
        int ans = 0;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(can(candies, mid, k)) {
                ans = mid;
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return ans;
    }
}