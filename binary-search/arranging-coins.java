class Solution {
    public int arrangeCoins(int n) {
        if(n==1) return 1;
        int i = 1;
        while(n >= i){
            n -= i++;
        }
        return i-1;
    }
}