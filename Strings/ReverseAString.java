

public class ReverseAString {
    public static void main(String[] args){
        String original = " hello";
        char[] characters = original.toCharArray();
        String reversed = " ";

        for(int i = characters.length-1;i>=0;i--){
            reversed +=characters[i];
        }

        System.out.println("The reversed string is "+ reversed);

    }
}
