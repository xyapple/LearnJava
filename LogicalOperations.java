public class LogicalOperations {
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;
        boolean c = false;
        boolean d = true;

        System.out.println((a && b) + " not pass");
        System.out.println((a || b) + " pass");
        System.out.println((!a) + " not pass");
        System.out.println(( c ^ d) + " pass");

    }
}
