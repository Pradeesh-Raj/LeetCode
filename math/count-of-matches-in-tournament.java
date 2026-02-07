class Solution {
    public int numberOfMatches(int n) {
        int temp = n, matches = 0;
        while(temp != 1){
            if((temp & 1) == 0){
                temp = temp / 2;
                matches += temp;
            }
            else{
                matches += temp/2;
                temp = temp/2 + 1;
            }
        }
        return matches;
    }
}