class Solution {

    private int countPair(int[] nums,int low,int mid,int high){
        int right = mid+1;
        int count = 0;
        for(int i = low ; i <= mid ; i++){
            while(right <= high && nums[i] > 2 * (long)nums[right]) right++;
            count += (right - (mid+1)); 
        }
        return count;
    }

    private static int merge(int[] nums,int low,int mid,int high){
        int count = 0;
        int left = low, right = mid+1;
        ArrayList<Integer> res = new ArrayList<>();
        while(left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                res.add(nums[left]);
                left++;
            }
            else{
                res.add(nums[right]);
                right++;
            }
        }
        while(left <= mid){
            res.add(nums[left]);
            left++;
        }
        while(right <= high){
            res.add(nums[right]);
            right++;
        }
        for(int i = low; i <= high ; i++){
            nums[i] = res.get(i - low);
        }
        return count;
    }

    private int mergeSort(int[] nums,int low,int high){
        int count = 0;
        if(low >= high) return count;
        int mid = (low + high) / 2;
        count += mergeSort(nums,low,mid);
        count += mergeSort(nums,mid+1,high);
        count += countPair(nums,low,mid,high);
        count += merge(nums,low,mid,high);
        return count;
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
}