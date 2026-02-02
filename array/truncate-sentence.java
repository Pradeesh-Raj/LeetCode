class Solution {
    public String truncateSentence(String s, int k) {
        int spCount = 0;
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ' '){
                spCount++;
                if(spCount >= k) break;
            }
            str.append(s.charAt(i));
        }
        return new String(str);

    }
}