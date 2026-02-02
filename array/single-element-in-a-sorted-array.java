class Solution {
    public int singleNonDuplicate(int[] nums) {
        int N = nums.length;
        if(N == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[N - 1] != nums[N - 2]) return nums[N - 1];
        int low = 1, high = N - 2;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
                return nums[mid];
            }
            if((((mid & 1) != 0) && (nums[mid] == nums[mid-1])) || (((mid & 1) == 0) && (nums[mid] == nums[mid+1]))){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}