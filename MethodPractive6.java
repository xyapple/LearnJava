import java.util.Arrays;

//use peram and return method
public class MethodPractive6 {
    public static void main(String[] args) {
        MethodPractive6 test = new MethodPractive6();
        int[] scores = {79, 52, 98, 81};
        int count = test.sortScore(scores);
        System.out.println("Total number of the scorces: " + count);
    }
    public int sortScore(int[] scoresArray){
        Arrays.sort(scoresArray);
        System.out.println(Arrays.toString(scoresArray));
        return scoresArray.length;
    }

}
