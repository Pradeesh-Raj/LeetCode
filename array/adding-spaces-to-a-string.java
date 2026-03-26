class Solution {
    public String addSpaces(String s, int[] spaces) {
        int i = 0, j = 0;
        StringBuilder result = new StringBuilder();
        while(i < s.length()) {
            if(j < spaces.length && i == spaces[j]) {
                result.append(" ");
                j++;
            }
            result.append(s.charAt(i));
            i++;
        }
        return new String(result);
    }
}