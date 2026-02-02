class Solution {
    public int reverse(int x) {
        long reverse = 0,temp = x;
        while(temp != 0){
            
            reverse = (reverse * 10) + (temp % 10);
            temp /= 10;
        }
        if(reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE){
                reverse = 0;
        }
        return (int)reverse;
    }
}