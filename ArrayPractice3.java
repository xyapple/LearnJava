public class ArrayPractice3 {
    public static void main(String[] args) {
        String[][] names={{"Tom", "Bill", "Mike"},{"Lisa", "Sheryl", "Alex"}};
        for(int i=0; i<names.length;i++){
            for(int j =0; j<names[i].length; j++){
                System.out.println(names[i][j]);
            }
        }
        System.out.println();
    }
}
