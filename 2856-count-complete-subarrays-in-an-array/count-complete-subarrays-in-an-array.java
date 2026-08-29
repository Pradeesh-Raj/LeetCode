class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int count = 0, N = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        int totalDistinct = set.size();

        int i = 0, j = 0, dis = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while(j < N) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            if(map.get(nums[j]) == 1) dis++;

            while(dis == totalDistinct) {
                map.put(nums[i], map.get(nums[i]) - 1);
                if(map.get(nums[i]) == 0) dis--;
                i++;
            }
            count += i;
            j++;
        }
        return count;
    }
}