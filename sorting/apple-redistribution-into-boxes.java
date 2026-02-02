class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int appleTotal = 0;
        for(int i : apple) appleTotal += i;
        int boxes = 0;
        for(int i = capacity.length-1 ; i >= 0 && appleTotal > 0 ; i--){
            boxes += 1;
            appleTotal -= capacity[i];
        }
        return boxes;
    }
}