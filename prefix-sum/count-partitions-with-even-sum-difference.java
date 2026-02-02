class Solution {
    public int countPartitions(int[] nums) {
        int totSum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            totSum += nums[i];
        }
        // int count = 0;
        // int tempSum = 0;
        // for(int i = 0 ; i < nums.length-1 ; i++){
        //     tempSum += nums[i];
        //     int diff = totSum - tempSum;
        //     if((tempSum - diff) % 2 == 0){
        //         count+=1;
        //     }
        // }
        //return count;
        if(totSum % 2 != 0) return 0;
        return nums.length - 1;
    }
}