class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int i = 0,j = n;
        int index = 0;
        while(i < n && j < nums.length){
            result[index++] = nums[i];
            result[index++] = nums[j];
            i++;j++;
        }
        return result;
    }
}