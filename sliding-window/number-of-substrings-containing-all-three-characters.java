class Solution {
    public int numberOfSubstrings(String s) {
        int[] hash = new int[]{-1,-1,-1};
        char[] arr = s.toCharArray();
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            hash[arr[i] - 'a'] = i;
            count += (Math.min(hash[0],Math.min(hash[1],hash[2]))) + 1;
        }
        return count;
    }
}