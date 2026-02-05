class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String[] words = s.split("\\s+");
        int patN = pattern.length(), wordN = words.length;
        if(patN != wordN) return false;
        else{
            for(int i = 0 ; i < patN ; i++){
                if(map.containsKey(pattern.charAt(i))){
                    if(!(map.get(pattern.charAt(i)).equals(words[i]))){
                        return false;
                    }
                }
                else if(map.values().contains(words[i])){
                    return false;
                }
                else{
                    map.put(pattern.charAt(i), words[i]);
                }
            }
            return true;
        }
    }
}