class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int N = n + m;
        int idx2 = N / 2;
        int idx1 = idx2 - 1;
        int ele1 = -1,ele2 = -1;
        int count = 0;
        int i = 0 , j = 0;
        while(i < n && j < m){
            if(nums1[i] < nums2[j]){
                if(count == idx1) ele1 = nums1[i];
                if(count == idx2) ele2 = nums1[i];
                count++;
                i++;
            }
            else{
                if(count == idx1) ele1 = nums2[j];
                if(count == idx2) ele2 = nums2[j];
                count++;
                j++;
            }
        }
        while(i < n){
            if(count == idx1) ele1 = nums1[i];
            if(count == idx2) ele2 = nums1[i];
            count++;
            i++;
        }
        while(j < m){
            if(count == idx1) ele1 = nums2[j];
            if(count == idx2) ele2 = nums2[j];
            count++;
            j++;
        }
        if((N & 1) != 0){
            return (double)ele2;
        }
        else{
            return (double)(ele1+ele2) / 2;
        }
    }
}