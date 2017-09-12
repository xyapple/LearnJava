import java.awt.*;

public class OddNumberSum {
    public static void main(String[] args){
        int sum = 0;
        int num = 2;
        do{
            sum = sum + num; //sum = num + num + .....实现累加求和
            num = num + 2; //make sure the number is odd 每执行一次将数值加2，以进行下次循环条件判断

        } while (num <= 50); {
            System.out.println("0-50 total sum of odd numbers= " + sum);
        }
    }
}
