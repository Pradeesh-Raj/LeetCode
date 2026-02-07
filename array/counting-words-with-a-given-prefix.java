class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String i : words){
            count += (i.startsWith(pref)) ? 1 : 0;
        }
        return count;
    }
}