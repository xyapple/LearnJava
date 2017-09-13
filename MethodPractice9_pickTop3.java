//pick the top three numbers
import java.util.Arrays;
import java.util.Scanner;
public class MethodPractice9_pickTop3 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter an Array of numbers and separate them by comma: ");
        String userInputNum = userInput.next();
        String[] userInputArray = userInputNum.split(",");
        int[] scores = new int[userInputArray.length];
        for(int i = 0; i<userInputArray.length; i++){
            scores[i] = Integer.parseInt(userInputArray[i]);
            //System.out.print("User had enter: "+ scores[i]+" ");
        }

        System.out.println("The top 3 scores are: ");

        //int[] scores = {89,-23,64,91,119,52,73};

        MethodPractice9_pickTop3 test = new MethodPractice9_pickTop3();

        test.getTopScores(scores);

    }
    //get the top 3 numbers from a Array; Print the top 3 from array then Break!
    public void getTopScores(int[] scores){
        //sort the Array Scores first
        Arrays.sort(scores);

        int numberCount = 0;
        for(int i = scores.length - 1; i>= 0; i-- ){

            if(scores[i]<0 || scores[i]>100){
                continue;
            }
            numberCount++;

            if(numberCount > 3){
                break;
            }
            System.out.println(scores[i]);
        }

    }

}
