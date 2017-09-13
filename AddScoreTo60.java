public class AddScoreTo60 {
    public static void main(String[] args){
        // 变量保存成绩
        int score = 53;
        // 变量保存加分次数
        int count = 0;
        //打印输出加分前成绩
        System.out.println("Previous score: " + score);
        // 只要成绩小于60，就循环执行加分操作，并统计加分次数
        while(score < 60){
            count++;
            score++;
//            if (score > 60){
//                break;
//            }

        }
        //打印输出加分后成绩，以及加分次数
        //System.out.println("Previous score: " + score);
        System.out.println("Current score: " + score);
        System.out.println("Total count: " + count);
    }
}
