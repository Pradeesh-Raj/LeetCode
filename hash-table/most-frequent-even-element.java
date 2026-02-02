class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int N = nums.length;
        int freq = Integer.MIN_VALUE,element = Integer.MAX_VALUE;
        for(int i : nums){
            if((i & 1) == 0){
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }
        if(map.isEmpty()) return -1;
        for(Map.Entry<Integer,Integer> mpp : map.entrySet()){
            int ele = mpp.getKey();
            int val = mpp.getValue();
            if(val == freq){
                element = Math.min(ele,element);
            }
            else if(val > freq){
                freq = val;
                element = ele;
            }
        }
        return element;
    }
}