class Solution {
    public boolean isVowel(char ch){
        return (("aeiouAEIOU".indexOf(ch) != -1) ? true : false);
    }

    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] res = s.toCharArray();
        boolean v1,v2;
        v1=v2=false;
        while(i < j){
            v1 = isVowel(s.charAt(i));
            v2 = isVowel(s.charAt(j));
            if(!v1) i++;
            if(!v2) j--;
            if(v1 && v2){
                char temp = res[i];
                res[i] = res[j];
                res[j] = temp;
                i++;j--;
            }
        }
        return new String(res);
    }
}