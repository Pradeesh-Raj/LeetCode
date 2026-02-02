class Solution {
    public int maxFreqSum(String s) {
        int freqVowel = 0;
        int freqCons = 0;
        int N = s.length();
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < N ; i++){
            char tmp = s.charAt(i);
            map.put(tmp, map.getOrDefault(tmp,0)+1);
            if(("aeiou".indexOf(tmp)) != -1){
                freqVowel = Math.max(freqVowel, map.get(tmp));
            }
            else{
                freqCons = Math.max(freqCons, map.get(tmp));
            }
        }
        return freqVowel + freqCons;
    }
}