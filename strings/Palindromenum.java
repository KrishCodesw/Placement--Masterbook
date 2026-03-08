public class Palindromenum {
    public static void main(String[] args) {
        String s = "racecar";
        // String s = "abcdcba";
        int start = 0;
        int end = s.length() - 1;
        int mid = start + (end - start) / 2;
        for (int i = 0; i <= mid; i++) {
            if (s.charAt(start) == s.charAt(end)) {
                System.out.println("Match");
            }
            start++;
            end--;

        }
    }
}