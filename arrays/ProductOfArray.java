public class ProductOfArray {
    public static void main(String[] args) {
        int [] arr = {10,30,50,70,90,888,90};

        int sum = 0 ;

        for(int num: arr){
            sum += num;
        }

        double average = (double)sum / arr.length;
        System.out.print("The Average of the array is "+ average);
    }
}
