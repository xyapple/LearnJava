import java.util.Scanner;

public class AddScoreTo60 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //take user input
        System.out.print("Please enter your score: ");

        int score = input.nextInt(); //user has to enter previous score
        int count = 0;
        System.out.println("Previous score: " + score);

        while(score < 60){
            count++;
            score++;
//            if (score > 60){
//                break;
//            }

        }
        System.out.println("Current score: " + score);
        System.out.println("Total count: " + count);
    }
}
