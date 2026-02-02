class Solution {
    public int maxArea(int[] arr) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int i = 0 , j = n - 1;
        while(i < j){
            int maxH = Math.min(arr[i], arr[j]);
            int dist = j - i;
            max = Math.max(dist*maxH, max);
            if(arr[i] == arr[j]){
                i++;j--;
            }
            else if(arr[i] < arr[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}