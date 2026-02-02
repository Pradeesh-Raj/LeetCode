class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int Jcount = 0;
        for(char jewel : jewels.toCharArray()){
            for(char stone : stones.toCharArray()){
                Jcount += (jewel == stone) ? 1 : 0;
            }
        }
        return Jcount;
    }
}