public class SkipCharacter {
    // pass the ans string in the arg
    // create the ans variable in the function body
    // baccad
    // bccd
    // we have to skip "a"
    // initially empty

    public static void main(String[] args) {
        skipCh("", "baccad");
        System.out.println(  skipCh("baccad")); 
      
    }

    public static void skipCh(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if (ch == 'a') {
            skipCh(processed, unprocessed.substring(1));

        } else {
            skipCh(processed + ch, unprocessed.substring(1));
        }

    }

    public static String skipCh(String unprocessed) {
        if (unprocessed.isEmpty()) {
            return "";
        }
        char ch = unprocessed.charAt(0);
        if (ch == 'a') {
            return skipCh(unprocessed.substring(1));

        } else {
            return ch + skipCh(unprocessed.substring(1));
        }

    }

}
