public class MethodPractive5 {
    public static void main(String[] args) {
        MethodPractive5 test = new MethodPractive5();
        test.calAvg(94,81);
    }
    public void calAvg(int score1, int score2){
        double avgScore = (score1+score2)/2;
        System.out.println("The average score: "+avgScore);
        //return avgScore becuase I use the void, I cannot use it.

    }

}
