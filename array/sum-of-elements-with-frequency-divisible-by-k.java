class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int[] hash = new int[101];
        for(int i : nums) {
            hash[i]++;
        }
        int sum = 0;
        for(int i = 1 ; i < 101 ; i++) {
            if(hash[i] % k == 0) {
                sum += i*hash[i];
            }
        }
        return sum;
    }
}