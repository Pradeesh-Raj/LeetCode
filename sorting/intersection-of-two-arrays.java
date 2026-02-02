class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1 = nums1.length;
        int n2 = nums2.length;
        // int[] visited = new int[n2];
        int index = 0;
        Set<Integer> intersec = new LinkedHashSet<>();
        // for(int i = 0 ; i < n1 ; i++){
        //     for(int j = 0 ; j < n2 ; j++){
        //         if(nums1[i] == nums2[j] && visited[j] == 0){
        //             intersec.add(nums1[i]);
        //             visited[j] = 1;
        //             break;
        //         }
        //         if(nums2[j] > nums1[i]) break;
        //     }
        // }
        int i,j;
        i=j=0;
        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]) i++;
            else if(nums1[i] > nums2[j]) j++;
            else{
                intersec.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] res = new int[intersec.size()];
        for(Integer k : intersec){
            res[index++] = k;
        }
        return res;
    }
}