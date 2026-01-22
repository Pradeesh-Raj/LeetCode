class Solution {
    public boolean isBalanced(String num) {
        int eSum = 0;
        int tSum = 0;
        for(int i = 0 ; i < num.length() ; i++){
            if((i & 1) == 0) eSum += num.charAt(i) - '0';
            tSum += num.charAt(i) - '0';
        }
        return eSum == (tSum - eSum);
    }
}