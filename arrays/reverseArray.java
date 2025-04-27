
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of an array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the "+ n + " elements");
        for(int i =0; i < n;i++){
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end   = n - 1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }

        System.out.println("Reversed array ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
