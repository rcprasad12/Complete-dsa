public class StrStrSearch {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        int index = -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                index = i;
                break;
            }
        }

        System.out.println("Index of '" + needle + "' in '" + haystack + "': " + index);
    }
}
