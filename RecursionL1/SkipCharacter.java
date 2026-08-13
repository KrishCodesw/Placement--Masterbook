public class SkipCharacter {
    // pass the ans string in the arg
    // create the ans variable in the function body
    // baccad
    // bccd
    // we have to skip "a"
    // initially empty

    public static void main(String[] args) {
        skipCh("", "baccad");
        System.out.println(skipCh("baccad"));
        System.out.println(skipString("bacapplecdah"));
        System.out.println(skipsubString("baca dah"));

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

    public static String skipString(String unprocessed) {
        if (unprocessed.isEmpty()) {
            return "";
        }

        if (unprocessed.startsWith("apple")) {
            return skipString(unprocessed.substring(5));

        } else {
            return unprocessed.charAt(0) + skipString(unprocessed.substring(1));
        }

    }

    public static String skipsubString(String unprocessed) {
        if (unprocessed.isEmpty()) {
            return "";
        }

        if (unprocessed.startsWith("app") && !unprocessed.startsWith("apple")) {
            return skipsubString(unprocessed.substring(3));

        } else {
            return unprocessed.charAt(0) + skipsubString(unprocessed.substring(1));
        }

    }

}
