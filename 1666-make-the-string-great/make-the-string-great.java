class Solution {
    public String makeGood(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if(!stk.isEmpty()) {
                char top = stk.peek();
                if(Math.abs(ch - top) == 32) {
                    stk.pop();
                }
                else stk.push(ch);
            }
            else stk.push(ch);
        }
        if(stk.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for(char ch : stk) {
            sb.append(ch);
        }
        return sb.toString();
    }
}