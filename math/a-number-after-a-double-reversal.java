class Solution {
    public static int reverse(int num) {
        int temp = num;
        int rev = 0;
        while(temp != 0) {
            rev = (rev * 10) + (temp % 10);
            temp /= 10;
        }
        return rev;
    }
    public boolean isSameAfterReversals(int num) {
        return reverse(reverse(num)) == num;
    }
}