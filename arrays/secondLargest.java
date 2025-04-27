public class secondLargest {
    public static void main(String[] args) {
        int [] arr = {12,44,65,78,45,99};

        int largest = Integer.MIN_VALUE;
        int secondLargestt = Integer.MIN_VALUE;

        for(int num: arr){
            if(num > largest){
                secondLargestt = largest;;
                largest = num;
            }
            else if (num > secondLargestt && num < largest){
                secondLargestt = num;
            }

        }
        System.out.println("The second largest elemment is  " + secondLargestt);
    }
}
