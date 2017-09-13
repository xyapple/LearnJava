public class MethodPractice4 {
    public static void main(String[] args) {
        MethodPractice4 test = new MethodPractice4();
        double maxAage = test.getMaxAage();
        System.out.println("The oldest of Age is : "+maxAage);
    }
    public double getMaxAage(){
        int[] ages = {18, 23, 21, 19, 25,29, 17, 32, 33, 36};
        int max = ages[0];
        for (int age: ages) {
            if(max < age){
                max = age;
            }
        }
        return max;
    }
}
