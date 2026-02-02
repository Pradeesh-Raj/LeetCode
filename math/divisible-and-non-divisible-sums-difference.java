class Solution {
    public int differenceOfSums(int n, int m) {
        int sumN;
        sumN = 0;
        for(int i = 1 ; i <= n ; i++){
            if(i % m != 0) sumN += i;
        }
        int tot = (n * (n+1)) / 2;

        return sumN - (tot-sumN);
    }
}