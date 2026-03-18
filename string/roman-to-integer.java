class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum = 0;
        int N = s.length();
        for(int i = 0 ; i < N ; i++) {
            sum += map.get(s.charAt(i));
        }

        for(int i = 0 ; i < N ; i++) {
            if(s.charAt(i) == 'I') {
                if(i+1 < N && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')) sum -= 2;
            }
            else if(s.charAt(i) == 'X') {
                if(i+1 < N && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')) sum -= 20;
            }
            else if(s.charAt(i) == 'C') {
                if(i+1 < N && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')) sum -= 200;
            }
        }
        return sum;
    }
}