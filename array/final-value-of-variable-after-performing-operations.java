class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for(int i = 0 ; i < operations.length ; i++){
            if(operations[i].substring(0,2).equals("++") || operations[i].substring(1,3).equals("++")){
                X+=1;
            }
            else X-=1;
        }
        return X;
    }
}