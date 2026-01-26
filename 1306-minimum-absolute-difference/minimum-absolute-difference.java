class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int i = 0, j = 1;
        Arrays.sort(arr);
        int N = arr.length, min = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();
        while(j < N){
            if(arr[j] - arr[i] < min){
                result.clear();
                result.add(Arrays.asList(arr[i],arr[j]));
                min = arr[j] - arr[i];
            }
            else if(arr[j] - arr[i] == min){
                result.add(Arrays.asList(arr[i],arr[j]));
            }
            i++;j++;
        }
        return result;
    }
}