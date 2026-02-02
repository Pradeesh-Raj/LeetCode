class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        long ans = 1;
        result.add((int)ans);
        for(int i = 0 ; i < rowIndex ; i++){
            ans = ans * (rowIndex - i);
            ans = ans / (i + 1);
            result.add((int)ans);
        }
        return result;
    }
}