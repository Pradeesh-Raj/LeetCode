class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        ArrayList<Integer> mountains = new ArrayList<>();
        int N = height.length;
        for(int i = 1 ; i < N ; i++){
            if(height[i-1] > threshold){
                mountains.add(i);
            }
        }
        return mountains;
    }
}