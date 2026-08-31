class Solution {
    public String longestNiceSubstring(String s) {
        int si = -1, maxLength = 0;
        int N = s.length();
        for(int i = 0 ; i < N ; i++) {
            Set<Character> set = new HashSet<>();
            for(int j = i ; j < N ; j++) {
                char ch = s.charAt(j);
                boolean isNice = true;
                set.add(ch);
                for(char c : set) {
                    char oppositeCase = (char) (c ^ 32);
                    if(!set.contains(oppositeCase)) {
                        isNice = false;
                        break;
                    }
                }

                if(isNice && maxLength < j-i+1){
                    maxLength = j-i+1;
                    si = i;
                } 
            }
        }
        return si == -1 ? "" : s.substring(si, si + maxLength);
    }
}