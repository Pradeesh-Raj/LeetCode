class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int min = Integer.MAX_VALUE;
        int i, j, N1 = nums1.length, N2 = nums2.length;
        i = j = 0;
        while(i < N1 && j < N2){
            if(nums1[i] < nums2[j]) i++;
            else if(nums1[i] > nums2[j]) j++;
            else{
                min = Math.min(min,nums1[i]);
                i++;j++;
            }
        }
        return (min == Integer.MAX_VALUE) ? -1 : min;
    }
}