import java.util.Arrays;
import java.util.Collections;

public class SortArrayDescending {
    public static void main(String[] args){ 
        Integer [] arr = {3,4,5,44,36,78,98,34,666};
        
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.print("The Array after sorting in the descending order ");

        for(int num : arr){
            System.out.print(num + " ");
        }

    }
}
