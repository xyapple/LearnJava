//understand Arrays.sort() and Arrays.toString()
import java.util.Arrays;
public class ArrayPractice2 {
    public static void main(String[] args) {
        String[] hobbies=new String[]{"Reading", "Kayaking", "Game", "Movies", "Sports"};
        Arrays.sort(hobbies);
        System.out.println("After sorting result" + hobbies);
        System.out.println("After sorting and toString() result: " + Arrays.toString(hobbies));

    }

}
