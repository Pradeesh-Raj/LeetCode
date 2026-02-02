class Solution {
    public static int countSubarrays(int[] nums, int k){
        int left = 0, right = 0, countSub = 0, N = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        while(right < N){
            map.put(nums[right] , map.getOrDefault(nums[right],0)+1);
            while(map.size() > k){
                map.replace(nums[left], map.get(nums[left]) - 1);
                if(map.get(nums[left]) == 0) map.remove(nums[left]);
                left++;
            }
            countSub += right-left+1;
            right++;
        }
        return countSub;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return countSubarrays(nums,k) - countSubarrays(nums,k-1); 
    }
}