class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String second = strs[strs.length - 1];
        int i = 0;
        while(i < first.length() && i < second.length()){
            if(first.charAt(i) != second.charAt(i)) break;
            else i++;
        }
        return first.substring(0,i);

    }
}