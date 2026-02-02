class Solution {
    public static void swap(int[] n1, int[] n2, int index1,int index2){
        int temp = n1[index1];
        n1[index1] = n2[index2];
        n2[index2] = temp;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0) {
            for(int i = 0 ; i < n ; i++){
                nums1[i-m] = nums2[i];
            }
            return;
        }
        if(n == 0){
            return;
        }
        int len = m + n;
        int gap = (len / 2) + (len % 2);
        while(gap > 0){
            int left = 0, right = left + gap;
            while(right < len){
                if(left < m && right >= m){
                    if(nums1[left] > nums2[right - m]){
                        swap(nums1,nums2,left,right-m);
                    }
                }
                else if(left >= m){
                    if(nums2[left - m] > nums2[right - m]){
                        swap(nums2,nums2,left-m,right-m);
                    }
                }
                else{
                    if(nums1[left] > nums1[right]){
                        swap(nums1,nums1,left,right);
                    }
                }
                left++;right++;
            }
            if(gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }
        for(int i = m ; i < len ; i++){
            nums1[i] = nums2[i-m];
        }
    }
}