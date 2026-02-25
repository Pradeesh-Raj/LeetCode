class Solution {
    public int[] sortByBits(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++) {
            int min = i;
            for(int j = i+1 ; j < arr.length ; j++) {
                int count = Integer.bitCount(arr[j]);
                int minCount = Integer.bitCount(arr[min]);
                if(count < minCount || (count == minCount && arr[j] < arr[min])) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}