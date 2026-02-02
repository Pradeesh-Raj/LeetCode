class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int N = nums.length;
        int closest = Integer.MAX_VALUE, element = Integer.MIN_VALUE;
        for(int i = 0 ; i < N ; i++){
            int j = i+1, k = N-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target) return sum;
                int distance = Math.abs(sum-target);
                if(distance < closest){
                    closest = distance;
                    element = sum;
                }
                if(sum < target) j++;
                else k--;
            }
        }
        return element;
    }
}