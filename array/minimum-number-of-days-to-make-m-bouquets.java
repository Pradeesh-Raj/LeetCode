class Solution {
    public static int maxElement(int[] nums, int N){
        int max = nums[0];
        for(int i = 1 ; i < N ; i++){
            max = (nums[i] > max) ? nums[i] : max;
        }
        return max;
    }
    public static int minElement(int[] nums, int N){
        int min = nums[0];
        for(int i = 1 ; i < N ; i++){
            min = (nums[i] < min) ? nums[i] : min;
        }
        return min;
    }

    public static boolean possibleBouquets(int[] arr, int m, int k, long day, int N){
        int count = 0, bouquets = 0;
        for(int i = 0 ; i < N ; i++){
            if(arr[i] <= day){
                count++;
            }
            else{
                bouquets += (count / k);
                count = 0;
            }
        }
        bouquets += (count / k);
        if(bouquets >= m) return true;
        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int N = bloomDay.length;
        if(N < m*k) return -1;
        int low = minElement(bloomDay, N);
        int high = maxElement(bloomDay, N);
        int res = -1;
        while(low <= high){
            long mid = low + (high-low)/2;
            if(possibleBouquets(bloomDay, m, k, mid, N)){
                res = (int)mid;
                high = (int)mid - 1;
            }
            else low = (int)mid + 1;
        }
        return res;
    }
}