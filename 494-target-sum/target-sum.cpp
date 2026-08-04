class Solution {
    public:
    int findTargetSumWays(vector<int> &nums, int target) {
        int N = nums.size();
        vector<int> curr = {0};
        for(int i = 0 ; i < N ; i++) {
            vector<int> newL(curr.size() * 2);
            int si = 0;
            for(int j : curr) {
                newL[si++] = (j + nums[i]);
                newL[si++] = (j - nums[i]);
            }
            curr = newL;
        }
        int cnt = 0;
        for(int i : curr) {
            if(i == target) cnt++;
        }
        return cnt;
    }
};