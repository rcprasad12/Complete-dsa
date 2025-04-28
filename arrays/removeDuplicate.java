import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicate{
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,4,5,5,6,7,8,8,9};

        Set <Integer> set = new LinkedHashSet<>();
        for(int num : arr){
            set.add(num);
        }
        
    }

}