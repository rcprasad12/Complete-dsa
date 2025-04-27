
import java.util.HashSet;



public class duplicate{
public static void main(String[] args) {
    
    String[] arr = {"a", "b", "c", "c", "d", "d"};

    HashSet<String> seen = new HashSet<>();
    System.out.println("Duplicates are ");

    for (String Str:arr){
        if(!seen.add(Str)){
                System.out.println(Str);
        }
    }

}
}