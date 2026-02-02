class Solution {

    public static int maxElement(int[] nums, int N){
        int max = nums[0];
        for(int i : nums){
            max = (i > max) ? i : max;
        }
        return max;
    }

    public static long divideNsum(int[] arr, long divisor){
        long sum = 0;
        for(int i : arr){
            sum += (long)Math.ceil((double)i / divisor);
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int N = nums.length;
        int low = 1, high = maxElement(nums, N);
        int ans = high;
        while(low <= high){
            long mid = low + (high - low)/2;
            long sum = divideNsum(nums,mid);
            if(sum <= threshold){
                ans = Math.min((int)mid,ans);
                high = (int)mid - 1;
            }
            else{
                low = (int)mid + 1;
            }
        }
        return ans;
    }
}