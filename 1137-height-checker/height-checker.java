class Solution {
    public int heightChecker(int[] heights) {
        int N = heights.length;
        int[] expected = new int[N];
        for(int i = 0 ; i < N ; i++) {
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
        int count = 0;
        for(int i = 0 ; i < N ; i++) {
            if(heights[i] != expected[i]) count++;
        }
        return count;
    }
}