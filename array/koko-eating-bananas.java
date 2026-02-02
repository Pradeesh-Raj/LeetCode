class Solution {
    public static long totalHours(int[] arr, long BPH){
        long total = 0;
        for(int i = 0 ; i < arr.length ; i++){
            total += (long)Math.ceil((double)arr[i] / BPH);
        }
        return total;
    }
    public static int maxElement(int[] arr){
        int max = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = maxElement(piles), ans = -1;
        while(low <= high){
            long mid = low + (high - low)/2;
            long totH = totalHours(piles,mid);
            if(totH <= h){
                ans = (int)mid;
                high = (int)mid - 1;
            }
            else low = (int)mid + 1;
        }
        return ans;
    }
}