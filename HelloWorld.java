public class HelloWorld {
    public static void main(String[] args) {
//       int x = 7;
//       int y = x;
//       x=2;
//       System.out.println(x+","+y);
        int a = 5;
        int b = 7;
        swap(a, b);
        System.out.println(a + ", " + b);
        System.out.println("I start to learn Java!");
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
