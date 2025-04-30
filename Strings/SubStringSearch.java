package Strings;

public class SubStringSearch {
    public static void main(String[] args) {
        String str = "hello";
        String neddle = "ll";

        int index = str.indexOf(neddle);

        System.out.println("The Substring is present at "+ index + " of string " + str + " of " + neddle);

    }
}
