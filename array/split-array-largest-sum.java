class Solution {
    public static int subarrayCount(int[] arr, int max , int k){
        int count = 1, ssum = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(ssum + arr[i] > max){
                count++;
                ssum = arr[i];
            }
            else ssum += arr[i];
        }
        return count;
    }

    public static int max(int[] arr){
        int max = arr[0]; 
        for(int i = 1 ; i < arr.length ; i++){
            max = (arr[i] > max) ? arr[i] : max;
        }
        return max;
    }

    public static int sum(int[] arr){
        int sum = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public int splitArray(int[] nums, int k) {
        int low = max(nums), high = sum(nums);
        while(low <= high){
            int mid = low + (high - low)/2;
            if(subarrayCount(nums,mid,k) > k){
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return low;
    }
}