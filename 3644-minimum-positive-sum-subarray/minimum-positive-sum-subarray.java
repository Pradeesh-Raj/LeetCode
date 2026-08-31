class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = Integer.MAX_VALUE;
        int N = nums.size();
        for(int i = 0 ; i < N ; i++) {
            int sum = 0;
            for(int j = i ; j < N ; j++) {
                sum += nums.get(j);
                int len = j - i + 1;
                if(len > r) break;
                if(len >= l && len <= r && sum > 0 && sum < min) {
                    min = sum;
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}