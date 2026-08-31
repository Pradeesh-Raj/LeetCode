class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>();
        Set<String> resultSet = new HashSet<>();
        for(int i = 0 ; i + 9 < s.length() ; i++) {
            String sub = s.substring(i, i+10);
            if(!set.add(sub)) resultSet.add(sub);
        }
        return new ArrayList<>(resultSet);
    }
}