class Solution {
    public static int operations(String s, char firstCh) {
        int count = 0;
        if(firstCh == '0') {
            for(int i = 0 ; i < s.length() ; i++) {
                if(i % 2 == 0 && s.charAt(i) != '0') count++;
                else if(i % 2 != 0 && s.charAt(i) != '1') count++;
            }
        }
        else {
            for(int i = 0 ; i  < s.length() ; i++) {
                if(i % 2 == 0 && s.charAt(i) != '1') count++;
                else if(i % 2 != 0 && s.charAt(i) != '0') count++;
            }
        }
        return count;
    }
    public int minOperations(String s) {
        return Math.min(operations(s,'0'), operations(s,'1'));
    }
}