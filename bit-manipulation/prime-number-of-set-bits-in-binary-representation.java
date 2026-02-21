class Solution {
    private static boolean isPrime(int num) {
        int count = 0;
        for(int i = 1 ; i <= Math.sqrt(num) ; i++) {
            if(num % i == 0) {
                count++;
                if(num / i != i) {
                    count++;
                }
            }
        }
        return ((count == 2) ? true : false);
    }

    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left ; i <= right ; i++) {
            int bitC = Integer.bitCount(i);
            count += ((isPrime(bitC)) ? 1 : 0);
        }
        return count;
    }
}