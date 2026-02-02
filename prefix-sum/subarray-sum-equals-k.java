import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        map.put(0,1);
        //int N = nums.length;
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            // if(sum == k){
            //     count++;
            // }
            int remaining = sum - k;
            if(map.containsKey(remaining)){
                count += map.get(remaining);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}