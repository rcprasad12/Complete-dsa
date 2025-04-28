public class CountEvenodd {
    public static void main(String[] args) {
        int[] arr = { 3,6,5,99,67,345,675,9999,888888, 7654,345678,47554739};

        int evenCount = 0;
        int oddCount = 0;

        for(int num : arr){
            if(num % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("The no. of even count are "+ evenCount);
        System.out.println("The no. of odd count are "+ oddCount);
    }
}
