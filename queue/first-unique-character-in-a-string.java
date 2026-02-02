class Solution {
    public int firstUniqChar(String s) {
        Map<String,Integer> map = new LinkedHashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            String ch = s.charAt(i)+"";
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }
        for(Map.Entry<String,Integer> mpp : map.entrySet()){
            if(mpp.getValue() == 1){
                return s.indexOf(mpp.getKey()+"");
            }
        }
        return -1;
    }
}