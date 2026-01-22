class Solution {
    public String removeDuplicates(String s) {
        int N = s.length();
        Stack<Character> st = new Stack<>();
        char[] letters = s.toCharArray();
        for(int i = 0 ; i < N ; i++){
            if(st.isEmpty()) st.push(letters[i]);
            else if(st.peek() != letters[i]){
                st.push(letters[i]);
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
            }
        }
        String res = "";
        for(Character ch : st){
            res+=ch;
        }
        return res;
    }
}