import java.util.Scanner;

public class AvageScoresOfStudents {
    public static void main(String[] args) {
        int classNum = 3; // classes
        int studentNum = 4; //students
        double sum = 0; //total sum of scores from all students
        double avg = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 1; i <= classNum; i++){
            sum = 0;
            System.out.println("*** Please enter each student score for the " + i +" class ***");
            for(int j=1; j<= studentNum; j++){
                System.out.print("Please enter the "+ j + " student: ");
                int score = input.nextInt();
                sum = sum + score;
            }
            avg = sum / studentNum;
            System.out.println("The average score of "+ i +" is: " + avg);

        }
    }
}
