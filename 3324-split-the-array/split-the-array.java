class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] hash = new int[101];
        for(int i : nums) {
            hash[i]++;
            if(hash[i] > 2) return false;
        }
        return true;
    }
}