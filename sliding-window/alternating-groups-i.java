class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int N = colors.length;
        int count = 0;
        for(int i = 0 ; i < N ; i++){
            int prev = colors[(i-1+N) % N];
            int next = colors[(i+1) % N];
            if(prev == next && prev != colors[i]){
                count++;
            }
        }
        return count;
    }
}