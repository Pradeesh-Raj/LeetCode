class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++) {
            int st = i + 1;
            int end = nums.length - 1;
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            while(st < end) {
                if(end < nums.length - 1 && nums[end] == nums[end+1]) {
                    end--;
                    continue;
                }
                int sum = nums[i] + nums[st] + nums[end];
                if(sum == 0) {
                    lists.add(Arrays.asList(nums[i], nums[st], nums[end]));
                    st++;
                    end--;
                }
                else if(sum < 0) st++;
                else end--;
            }
        }
        return lists;
    }
}