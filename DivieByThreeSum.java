public class DivieByThreeSum {
    public static void main(String[] args){
        int sum = 0; //set the sum

        for(int i=0;i <= 100; i++){
            if(i %3 == 0){
                sum = sum + i;
            }

        }
        System.out.println("The Total of numbers which can be divied by 3: "+ sum);
    }
}
