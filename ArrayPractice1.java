public class ArrayPractice1 {
    public static void main(String[] args) {
        int[] nums = new int[]{
                61, 78, 167, 237, 90, 42
        };
        int max = nums[0];
        int min = nums[0];
        double avg = 0;
        int sum = 0;
        for(int i=0; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
            if(min > nums[i]){
                min = nums[i];
            }
            sum = sum + nums[i];
        }
        avg = sum/nums.length;
        System.out.println("The Laragest number from the array is: "+max);
        System.out.println("The smallest number from the array is: "+min);
        System.out.println("The average number of the array is: "+avg);
    }
}

