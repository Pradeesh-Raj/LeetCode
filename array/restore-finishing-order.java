class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int m = friends.length;
        int[] res = new int[m];
        int n = order.length,index = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : friends){
            set.add(i);
        }
        for(int i = 0 ; i < n ; i++){
            if(set.contains(order[i])){
                res[index++] = order[i];
            }
        }
        return res;
    }
}