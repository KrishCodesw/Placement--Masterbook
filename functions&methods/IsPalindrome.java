public class IsPalindrome {
    public boolean isPalindrome(String s) {

        String newstr = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int start = 0;
        int last = newstr.length() - 1;
        while (start < last) {
            if (newstr.charAt(start) != newstr.charAt(last)) {
                return false;
            }
            start++;
            last--;
        }
        return true;

    }
}
