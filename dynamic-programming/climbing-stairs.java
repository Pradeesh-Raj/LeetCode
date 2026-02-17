class Solution {
    public int climbStairs(int n) {
        if(n <= 1) return 1;
        int num1 = 1,num2 = 1;
        int stairs = 0;
        for(int i = 2 ; i <= n ; i++){
            stairs = num1 + num2;
            num1 = num2;
            num2 = stairs;
        }
        return stairs;
    }
}