class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int preSum = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            preSum += nums[i];
            if(map.containsKey(preSum % k)) {
                if(i - map.get(preSum % k) >= 2) {
                    return true;
                }
            }
            else map.put(preSum % k, i);
        }
        return false;
    }
}