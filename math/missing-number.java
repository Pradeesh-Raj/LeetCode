class Solution {
    public int missingNumber(int[] nums) {
        int XOR1,XOR2,N = nums.length;
        XOR1 = XOR2 = 0;
        for(int i = 0 ; i < N ; i++){
            XOR2 ^= nums[i];
            XOR1 ^= (i + 1);
        }
        return XOR1 ^ XOR2;

    }
}