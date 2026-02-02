class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int i = 0 , j = 0;
        int n = word1.length(),m = word2.length();
        while(i < n && j < m){
            res = res+word1.charAt(i);
            res = res+word2.charAt(j);
            i++;j++;
        }
        while(i<n){
            res = res+word1.charAt(i);
            i++;
        }
        while(j<m){
            res = res+word2.charAt(j);
            j++;
        }
        return res;
    }
}