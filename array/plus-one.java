import java.util.*;
class Solution {
    public int[] plusOne(int[] digits) {
       ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i : digits){
            arr.add(i);
        }
        for(int i = arr.size()-1 ; i >= 0 ; i--){
            if(arr.get(i) < 9){
                arr.set(i , arr.get(i) + 1);
                for(int j = 0 ; j < digits.length ; j++){
                    digits[j] = arr.get(j);
                }
                return digits;
            }
            else{
                arr.set(i,0);
            }
        }
        arr.addFirst(1);
        int[] num = new int[arr.size()];
        for(int j = 0 ; j < num.length ; j++){
            num[j] = arr.get(j);
        }
        return num;
    }
}