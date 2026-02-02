import java.util.regex.*;
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        String pattern = "["+allowed+"]+";
        Pattern pat = Pattern.compile(pattern);
        Matcher mat;
        int count = 0;
        for(String i : words){
            mat = pat.matcher(i);
            if(mat.matches()) count++;
        }
        return count;
    }
}