//Random generate an Array Numbers(0-100) by giving number count
import java.util.Arrays;
import java.util.Scanner;

public class MethodPractice8_randomNum {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter the number count for the array: ");
        int numArray = userInput.nextInt();
        //System.out.println(numArray);
        MethodPractice8_randomNum test = new MethodPractice8_randomNum();
        int[] randomNums = test.getNum(numArray);
        System.out.println(Arrays.toString(randomNums));
    }
    public int[] getNum(int numCount){
        //define how many numbers will be in array
        int[] nums = new int[numCount];
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random() * 100);
        }
        return nums;
    }

}
