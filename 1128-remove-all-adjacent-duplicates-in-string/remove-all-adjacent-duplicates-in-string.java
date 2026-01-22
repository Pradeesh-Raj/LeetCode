class Solution {
    public String removeDuplicates(String s) {
        int N = s.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < N ; i++){
            if(st.isEmpty()) st.push(s.charAt(i));
            else if(st.peek() != s.charAt(i)){
                st.push(s.charAt(i));
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for(Character ch : st){
            res.append(ch);
        }
        return res.toString();
    }
}