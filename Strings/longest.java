import java.util.*;

public class longest {
    public static void main(String[] args) {
        String input = "abcabcbb";
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;

        while (right < input.length()) {
            if (!set.contains(input.charAt(right))) {
                set.add(input.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                set.remove(input.charAt(left));
                left++;
            }
        }

        System.out.println("Length of longest substring without repeating characters in '" + input + "': " + maxLength);
    }
}
