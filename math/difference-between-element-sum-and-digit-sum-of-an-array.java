class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum = 0, digiSum = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            eleSum += nums[i];
            int temp = nums[i];
            while(temp != 0) {
                digiSum += (temp % 10);
                temp /= 10;
            }
        }
        return (int)Math.abs(eleSum-digiSum);
    }
}