class Solution {
    public int maxProduct(int[] nums) {
        int max_p = Integer.MIN_VALUE;
        int N = nums.length;
        int preMult = 1, postMult = 1;
        for(int i = 0 ; i < N ; i++){
            if(preMult == 0) preMult = 1;
            if(postMult == 0) postMult = 1;
            preMult *= nums[i];
            postMult *= nums[N-i-1];

            max_p = Math.max(max_p,Math.max(preMult,postMult));
        }
        return max_p;
    }
}