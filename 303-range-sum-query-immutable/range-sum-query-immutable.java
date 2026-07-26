class NumArray {
    private int[] arr;
    private int[] preSum;

    public NumArray(int[] nums) {
        arr = nums;
        preSum = new int[arr.length+1];
        for(int i = 1 ; i <= arr.length ; i++) {
            preSum[i] = preSum[i-1] + arr[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        return preSum[right+1] - preSum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */