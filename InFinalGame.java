public class InFinalGame {
    public static void main(String[] args){
        String sex = "Female";
        int score = 70;
        if(score > 80){
            if(sex.equals("Female")){
                System.out.println("Enter in Female Final Game");
            } else{
                System.out.println("Enter in Male Final Game");
            }
        }else{
            System.out.println("Sorry, Not Enter in Final Game");
        }
    }
}
