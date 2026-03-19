class Solution {
    public List<String> summaryRanges(int[] nums) {
        int start, end;
        List<String> result = new ArrayList<>();
        if(nums.length == 0) return result;
        start = end = nums[0];
        for(int i = 1 ; i < nums.length ; i++) {
            if(nums[i] == end+1) {
                end = nums[i];
            }
            else {
                if(start != end) {
                    result.add(start + "->" + end);
                }
                else result.add(Integer.toString(end));
                start = end = nums[i];
            }
        }
        if(start != end) result.add(start + "->" + end);
        else result.add(Integer.toString(end));
        return result;
    }
}