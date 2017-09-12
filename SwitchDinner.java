import java.awt.*;

public class SwitchDinner {
    public static void main(String[] args){
        String today = "Sunday";

        switch (today){
            case "Monday":
            case "Wednesday":
            case "Friday":
                System.out.println("Vegan");
                break;
            case "Tuesday":
            case "Thursday":
            case "Saturday":
                System.out.println("Everything but vegan");
                break;
            default:
                System.out.println("Dine Out");

        }

    }
}
