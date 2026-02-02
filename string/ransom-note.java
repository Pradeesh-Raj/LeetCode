import java.util.*;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hash1 = new HashMap<>();
        HashMap<Character,Integer> hash2 = new HashMap<>();

        for(char ch : ransomNote.toCharArray()){
            hash1.put(ch,hash1.getOrDefault(ch,0)+1);
        }

        for(char ch : magazine.toCharArray()){
            hash2.put(ch,hash2.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> mp : hash1.entrySet()){
            char key = mp.getKey();
            int value = mp.getValue();
            if(!( hash2.containsKey(key) && value <= hash2.get(key) )){
                return false;
            }
        }
        
        return true;
    }
}