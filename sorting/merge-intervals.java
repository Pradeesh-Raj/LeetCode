class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> res = new ArrayList<>();
        int N = intervals.length;
        for(int i = 0 ; i < N ; i++){
            int first = intervals[i][0], second = intervals[i][1];
            if(res.isEmpty() || res.get(res.size()-1)[1] < first){
                res.add(new int[]{first,second});
            }
            else{
                res.get(res.size()-1)[1] = Math.max(second,res.get(res.size()-1)[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}