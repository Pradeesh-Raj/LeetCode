class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int minDist = Integer.MAX_VALUE;
        int N = words.length;
        for(int i = 0 ; i < N ; i++) {
            if(words[i].equals(target)) {
                minDist = Math.min(minDist, Math.min((i - startIndex + N) % N, (startIndex - i + N) % N));
                System.out.println(minDist);
            }
        }
        return (minDist == Integer.MAX_VALUE) ? -1 : minDist;
    }
}