public class maxElement {
    public static void main(String [] args){
        int[] arr = {22,43,54,65,23,99,87,77};

        int max = arr[0];

        for(int Num : arr){
            if (Num > max){
                max = Num;
            }
        }

        System.out.println("The highest number in an array "+ max);



    }
}
