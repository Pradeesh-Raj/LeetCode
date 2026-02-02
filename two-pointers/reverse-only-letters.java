class Solution {
    public String reverseOnlyLetters(String s) {
        char[] letter = s.toCharArray();
        int N = letter.length;
        int i = 0, j = N - 1;
        while(i < j){
            if(Character.isAlphabetic(letter[i]) && Character.isAlphabetic(letter[j])){
                char temp = letter[i];
                letter[i] = letter[j];
                letter[j] = temp;
                i++;j--;
            }
            else if(!Character.isAlphabetic(letter[i])) i++;
            else j--;
        }
        return new String(letter);
    }
}