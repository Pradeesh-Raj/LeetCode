class Solution {
    private static int upperBound(char[] chars,int N, char target){
        int low = 0 , high = N-1;
        int ans = N;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(chars[mid] > target){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int index = upperBound(letters, n, target);
        if(index == n || !(letters[index] > target)){
            return letters[0];
        }
        return letters[index];
    }
}