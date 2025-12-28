import java.util.*;


public class twoSum {
    public int[] ttwoSum(){
        int[] numbers = {3,6,9,56,76,99};
        int target = 85;

        int left = 0;
        int right = numbers.length - 1 ;

        while(left < right){
            int currentSum = numbers[left] + numbers[right];

            if(currentSum == target){
                return new int[]{left+1 , right+1};
            }
            else if(currentSum < target){
                left++;
            }
            else{
                right--;
            }


        }
        return new int[]{};
    }

    public static void main(String[] args){
        twoSum solution = new twoSum();
        int[] result = solution.ttwoSum();
        System.out.println("RESULT IS : " + Arrays.toString(result));

    }
    
}
