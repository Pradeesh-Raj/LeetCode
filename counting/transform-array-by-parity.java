class Solution {
    public static void swap(int[] nums,int from, int to){
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }

    public int[] transformArray(int[] nums0) {
        int N = nums0.length;
        int[] nums = new int[N];
        for(int i = 0 ; i < N ; i++){
            if((nums0[i] & 1) == 0){
                nums[i] = 0;
            }
            else nums[i] = 1;
        }

        int low,mid,high = N - 1;
        low = mid = 0;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
        return nums;
    }
}