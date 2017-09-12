public class AgeGroup {
    public static void main(String[] args) {
        int age=31;
        if (age > 60){
            System.out.println("Elder");
        } else if (60 >= age && age > 40){
            System.out.println("Adult");
        } else if (40 > age && age >18){
            System.out.println("Young Adult");
        } else{
            System.out.println("Youth");
        }

    }
}
