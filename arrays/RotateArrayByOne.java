public class RotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int n = arr.length;
        int last = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;

        System.out.println("Array after rotating by one:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
