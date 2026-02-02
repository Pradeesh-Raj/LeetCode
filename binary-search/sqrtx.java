class Solution {
    public int mySqrt(int x) {
        int low = 1, high = x;
        int res = 0;
        while(low <= high){
            long mid = low + (high-low)/2;
            long sq = mid*mid;
            if(sq <= x){
                res = (int)mid;
                low = (int)mid+1;
            }
            else{
                high = (int)mid-1;
            }
        }
        return res;
    }
}