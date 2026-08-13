class Solution {
    public boolean isPalindrome(String s) {

        int start = 0;
        int last = s.length() - 1;
        while (start < last) {

            while(start<last && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while(start<last && !Character.isLetterOrDigit(s.charAt(last))){
                last--;
            }

            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(last))) {
                return false;
            }
            start++;
            last--;
            
        }
        return true;

    }
}