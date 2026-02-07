class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];
        for(String i : words){
            int pos = (i.charAt(i.length() - 1)) - '0';
            result[pos-1] = i.substring(0,i.length()-1);
        }
        String res = "";
        for(int i = 0 ; i < result.length ; i++){
            if(i != result.length-1){
                res += result[i] + " ";
                continue;
            }
            res += result[i];
        }
        return res;
    }
}