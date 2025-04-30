package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anargrams {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1, ch2));
        
    }
}
