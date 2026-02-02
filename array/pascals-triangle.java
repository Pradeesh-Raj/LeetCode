class Solution {
    public static List<Integer> generateRow(int row){
        List<Integer> Row = new ArrayList<>();
        int ans = 1;
        Row.add(ans);
        for(int i = 1 ; i < row ; i++){
            ans = ans * (row - i);
            ans = ans / i;
            Row.add(ans);
        }
        return Row;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 1 ; i <= numRows ; i++){
            result.add(generateRow(i));
        }
        return result;
    }
}