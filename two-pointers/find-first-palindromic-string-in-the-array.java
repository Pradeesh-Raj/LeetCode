class Solution {
    public static boolean isPalindrome(String s){
        if(s.length() == 1) return true;
        int i = 0, j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String i : words){
            if(isPalindrome(i)) return i;
        }
        return "";
    }
}