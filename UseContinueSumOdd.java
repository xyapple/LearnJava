public class UseContinueSumOdd {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 0; i<=10; i++){
            if(i % 2 != 0){
                continue;
            }
            sum = sum + i;

        }
        System.out.println("Total of odd numbers from 1-10 is: " + sum);
    }
}
