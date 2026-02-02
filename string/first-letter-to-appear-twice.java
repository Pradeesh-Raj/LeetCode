class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()){
            if(!set.add(ch)){
                return ch;
            }
        }
        return '1';
    }
}