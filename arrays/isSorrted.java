public class isSorrted {
    public static void main(String[] args) {
        int [] arr = { 22,45,67,54,33,1};
        boolean isSorted = true;

        for(int i = 0 ; i < arr.length-1;i++){
            if ( arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
                System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is Not Sorrted");
        }
    }
}
