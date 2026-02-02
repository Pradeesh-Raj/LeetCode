class Solution {
    private static int first(int[] nums,int N,int target){
        int low = 0,high = N-1;
        int first = N;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] >= target){
                first = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return first;
    }

    private static int second(int[] nums,int N,int target){
        int low = 0,high = N-1;
        int second = N;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] > target){
                second = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return second;
    }

    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        if(n == 0) return new int[]{-1,-1};
        int first = first(nums, n, target);
        if(first == n || nums[first] != target) return new int[]{-1,-1};

        return new int[]{first, second(nums, n, target) - 1};
    }
}