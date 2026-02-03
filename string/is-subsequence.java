class Solution {
    public boolean isSubsequence(String s, String t) {
        Set<Character> S = new LinkedHashSet<>();
        Set<Character> T = new LinkedHashSet<>();
        for(char i : s.toCharArray()) S.add(i);
        for(char i : t.toCharArray()) T.add(i);
        T.retainAll(S);
        return T.size() == S.size();
    }
}