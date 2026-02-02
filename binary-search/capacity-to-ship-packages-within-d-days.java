class Solution {
    public static int numberOfDays(int[] weight, int capacity){
        int day = 1, load = 0;
        for(int i : weight){
            if(load+i > capacity){
                day++;
                load = i;
            }
            else{
                load += i;
            }
        }
        return day;
    }

    public static int maxElement(int[] nums){
        int max = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            max = Math.max(max,nums[i]);
        }
        return max;
    }

    public static int sumElements(int[] nums){
        int sum = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            sum += nums[i];
        }
        return sum;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = maxElement(weights), high = sumElements(weights);

        while(low <= high){
            int mid = low + (high - low)/2;
            int daysRequired = numberOfDays(weights, mid);
            if(daysRequired <= days){
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}