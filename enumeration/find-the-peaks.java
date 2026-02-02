class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> peaks = new ArrayList<>();
        int N = mountain.length;
        for(int i = 1 ; i < N-1 ; i++){
            if(mountain[i] > mountain[i-1] && mountain[i] > mountain[i+1]){
                peaks.add(i);
            }
        }
        return peaks;
    }
}