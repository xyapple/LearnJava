public class PrintTriangleI {
    public static void main(String[] args){
        System.out.println("Print a Right Triangle");

        // 外层循环控制行数
        for(int i=1; i <= 3; i++){
            for(int j=1; j<= i; j++){
                // 内层循环控制每行的*号数
                // 内层循环变量的最大值和外层循环变量的值相等
                System.out.print("*");
            }
            //打印完后最后进行换行
            System.out.println();
        }

    }
}
