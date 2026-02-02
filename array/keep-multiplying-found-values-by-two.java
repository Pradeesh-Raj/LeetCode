class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> list = new HashSet<>();
        for(int i : nums) list.add(i);
        for(int i = 0 ; i < nums.length ; i++){
            if(list.contains(original)){
                original *= 2;
            }
        }
        return original;
    }
}