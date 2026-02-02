class Solution {
    public char findTheDifference(String s, String t) {
        int sXOR = 0;
        for(int i = 0 ; i < s.length() ; i++){
            sXOR ^= s.charAt(i);
        }
        int tXOR = 0;
        for(int i = 0 ; i < t.length() ; i++){
            tXOR ^= t.charAt(i);
        }

        return (char)(sXOR ^ tXOR);
    }
}