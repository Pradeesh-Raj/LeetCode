class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> subTable = new HashMap<>();
        char mappingChar = 97;
        for(char ch : key.toCharArray()){
            if(!Character.isSpaceChar(ch) && !subTable.containsKey(ch)){
                subTable.put(ch,mappingChar);
                mappingChar += 1;
            }
        }
        String res = "";
        for(char ch : message.toCharArray()){
            if(ch == ' ') res += ch;
            else{
                res += subTable.get(ch);
            }
        }
        return res;
    }
}