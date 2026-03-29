class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] evenS1 = {s1.charAt(0),s1.charAt(2)};
        char[] evenS2 = {s2.charAt(0),s2.charAt(2)};
        char[] oddS1 = {s1.charAt(1),s1.charAt(3)};
        char[] oddS2 = {s2.charAt(1),s2.charAt(3)};
        Arrays.sort(evenS1);
        Arrays.sort(evenS2);
        Arrays.sort(oddS1);
        Arrays.sort(oddS2);
        return Arrays.equals(evenS1,evenS2) && Arrays.equals(oddS1,oddS2);
    }
}