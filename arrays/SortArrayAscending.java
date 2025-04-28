import java.lang.reflect.Array;
import java.util.*;

public class SortArrayAscending {
    public static void main(String[] args) {
        int [] arr = { 33,11,9, 87, 65, 99 , 111};

        Arrays.sort(arr);
        System.out.println("Arrays after Ascnding order ");

        for ( int num : arr){
            System.out.print(num + " ");
        }
    }
}
