import java.util.Arrays;

public class mergeTwoArrays {
    public static void main(String[] args) {
        
        int[] arr1 = {1,2,3};
        int[] arr2 = {3,4,5};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] mergedArray = new int[n1+n2];

        for(int i = 0; i < n1 ; i++){
            mergedArray[i] = arr1[i];
        }

        for(int i = 0 ; i < n2 ; i++){
            mergedArray[n1+i] = arr2[i];
        }
        System.out.println("Merged array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

    }
}
