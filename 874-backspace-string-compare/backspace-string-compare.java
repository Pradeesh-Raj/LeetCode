class Solution {

    public Stack<Character> backspace(String s) {
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(ch == '#' && !stk.isEmpty()) stk.pop();
            else if(Character.isAlphabetic(ch)) stk.push(ch);
        }
        // System.out.println(stk.toString());
        return stk;
    }
    public boolean backspaceCompare(String s, String t) {
        return backspace(s).equals(backspace(t));
    }
}