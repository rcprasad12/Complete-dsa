public class minElement {
    public static void main(String[] args) {
        int[] arr ={3,5,7,9,9};

        int min = arr[0];
        for(int Num : arr){
            if(Num < min){
                min = Num;

            }
        }
        System.out.println("The minimum element in an array "+ min);

    }
}
