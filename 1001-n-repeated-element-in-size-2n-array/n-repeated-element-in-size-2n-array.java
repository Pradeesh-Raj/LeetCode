class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int len = nums.length;
        int N = len / 2;
        for(int i = 0; i < len ; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) == N) return nums[i];
        }
        return -1;
    }
}