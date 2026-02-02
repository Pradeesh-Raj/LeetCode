class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        char[] str = {};
        if(index != -1){
            str = word.toCharArray();
            int i,j;
            i = 0 ; j = index;
            while(i < j){
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;j--;
            }
            return new String(str);
        }
        return word;
    }
}