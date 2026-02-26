class Solution {
    public int numSteps(String s) {
        int count = 0;
        int temp = Integer.valueOf(s, 2);
        while(temp != 1) {
            temp = ((temp & 1) == 0) ? (temp / 2) : temp + 1;
            count++;
        }
        return count;
    }
}