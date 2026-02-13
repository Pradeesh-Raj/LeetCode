class Solution {
    public static int min(int[] arr){
        int min = arr[0];
        for(int i = 0 ; i < arr.length ; i++) min = Math.min(min,arr[i]);
        return min;
    }

    public static int max(int[] arr){
        int max = arr[0];
        for(int i = 0 ; i < arr.length ; i++) max = Math.max(max,arr[i]);
        return max;
    }

    public List<Integer> findMissingElements(int[] nums) {
        int min = min(nums), max = max(nums);
        Set<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        List<Integer> list = new ArrayList<>();
        for(int i = min ; i <= max ; i++){
            if(!set.contains(i)) list.add(i);
        }
        Collections.sort(list);
        return list;
    }
}