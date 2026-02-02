class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i : nums){
            freq.put(i, freq.getOrDefault(i,0)+1);
        }
        int goodPair = 0;
        for(Map.Entry<Integer,Integer> mpp : freq.entrySet()){
            int n = mpp.getValue();
            goodPair+=((n * (n - 1)) / 2);
        }
        return goodPair;
    }
}