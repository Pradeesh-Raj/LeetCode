class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1,N = nums.length;
        for(int i = N - 2 ; i >= 0 ; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            int i = 0 , j = N -1;
            while(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;j--;
            }
            return;
        }

        for(int i = N - 1 ; i >= index ; i--){
            if(nums[i] > nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }

        int i = index + 1, j = N - 1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;j--;
        }
    }
}