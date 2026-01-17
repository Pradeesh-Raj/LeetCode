class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0, right = 0, maxF = 0;
        int N = fruits.length;
        Map<Integer,Integer> map = new HashMap<>();
        while(right < N){
            map.put(fruits[right], map.getOrDefault(fruits[right],0) + 1);
            while(map.size() > 2){
                map.put(fruits[left], map.get(fruits[left])-1);
                if(map.get(fruits[left]) == 0) map.remove(fruits[left]);
                left++;
            }
            maxF = Math.max(maxF, right-left+1);
            right++;
        }
        return maxF;
    }
}