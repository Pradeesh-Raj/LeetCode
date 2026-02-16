class Solution {
    public int reverseBits(int n) {
        StringBuilder bitsReversed = new StringBuilder(String.format("%32s", Integer.toBinaryString(n)).replaceAll(" ", "0")).reverse();
        int res = Integer.parseInt(bitsReversed.toString(),2);
        return res;
    }
}