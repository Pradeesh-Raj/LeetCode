class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int index = 0;
        for(int i = 1 ; i <= n && index < target.length ; i++){
            if(target[index]  == i){
                result.add("Push");
                index++;
            }
            else{
                result.add("Push");
                result.add("Pop");
            }
        }
        return result;
    }
}