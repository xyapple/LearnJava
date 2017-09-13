public class CountDigitOfNum {
    public static void main(String[] args){

        int num = 999;
        int count = 0;

        if(num >= 0 && num <= 999999999){
            while(num != 0){
                count++;
                num = num/10;

            }
            System.out.println("The Total Digit of the Num is: " + count);

        } else{
            System.out.println("This is not a validate number");
        }

    }
}
