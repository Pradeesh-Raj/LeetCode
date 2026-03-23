class Solution {
    public int sumOfUnique(int[] nums) {
        int[] hash = new int[101];
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            hash[nums[i]]++;
        }
        for(int i = 1 ; i < 101 ; i++) {
            if(hash[i] == 1) sum += i;
        }
        return sum;
    }
}