class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s1 = new StringBuilder(a).reverse() , s2 = new StringBuilder(b).reverse() , res = new StringBuilder("");
        String result;
        int carry = 0 , maximum = Math.max(s1.length() , s2.length()) , total , digitA , digitB;
        for(int i = 0 ; i < maximum ; i++){
            digitA = ((i < s1.length()) ? s1.charAt(i) - '0' : 0);
            digitB = ((i < s2.length()) ? s2.charAt(i) - '0' : 0);
            total = digitA + digitB + carry;
            res.append(total % 2);
            carry = total / 2;
        }
        result = res.reverse().toString();
        if(carry != 0) result = "1" + result;
        return result;
    }
}