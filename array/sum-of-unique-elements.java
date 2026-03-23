class Solution {
    public int sumOfUnique(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            if(set.contains(nums[i])) {
                sum -= nums[i];
            }
            else {
                sum += nums[i];
            }
            set.add(nums[i]);
        }
        return (sum > 0) ? sum : 0;
    }
}