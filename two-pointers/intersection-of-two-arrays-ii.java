class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i ,j,index = 0;
        i=j=0;
        List<Integer> interList = new ArrayList<>();
        int[] intersection;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                interList.add(nums1[i]);
                i++;
                j++;
            }
        }
        intersection = new int[interList.size()];
        for(Integer in : interList){
            intersection[index++] = in;
        }
        return intersection;
    }
}