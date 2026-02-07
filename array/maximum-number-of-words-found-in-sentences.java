class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for(String sentence : sentences){
            max = Math.max(max,sentence.split(" ").length);
        }
        return max;
    }
}