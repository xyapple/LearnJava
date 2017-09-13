public class MethodPractice3_noPeramButReturn {
    public static void main(String[] args) {
        MethodPractice3_noPeramButReturn test = new MethodPractice3_noPeramButReturn();
        double avg = test.calculateAvg();
        System.out.println("The test is the average score: " + avg);
    }
    public double calculateAvg(){
        double num1 = 190.807;
        double num2 = 23.380;
        double avg = (num1 + num2) / 2;
        return avg;
    }
}
