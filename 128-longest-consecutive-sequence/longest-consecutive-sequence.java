class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        int longest = 1;
        for(int i : nums) set.add(i);

        for(int i : set){
            int element = i;
            if(!set.contains(element - 1)){
                int count = 1;
                while(set.contains(element+1)){
                    count+=1;
                    element+=1;
                }
                if(count > longest) longest = count;
            }
        }
        return longest;
    }
}