class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int E1,E2,cnt1,cnt2;
        int N = nums.length;
        E1 = E2 = Integer.MIN_VALUE;
        cnt1 = cnt2 = 0;
        for(int i = 0 ; i < N ; i++){
            if(cnt1 == 0 && E2 != nums[i]){
                cnt1 = 1;
                E1 = nums[i];
            }
            else if(cnt2 == 0 && E1 != nums[i]){
                cnt2 = 1;
                E2 = nums[i];
            }
            else if(E1 == nums[i]) cnt1++;
            else if(E2 == nums[i]) cnt2++;
            else{
                cnt1--;cnt2--;
            }
        }
        cnt1 = cnt2 = 0;
        for(int i = 0 ; i < N ; i++){
            if(nums[i] == E1) cnt1++;
            else if(nums[i] == E2) cnt2++;
        }
        if(cnt1 > (N/3)) result.add(E1);
        if(cnt2 > (N/3)) result.add(E2);
        
        return result;
    }
}