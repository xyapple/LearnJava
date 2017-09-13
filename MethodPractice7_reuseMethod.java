public class MethodPractice7_reuseMethod {
    private void print(){
        System.out.println("This is a no parameter print Method.");
    }
    private void print(String name){
        System.out.println("This is a print Method with a String parameter but no Return, name: " + name);
    }
    private void print(int age){
        System.out.println("This is a print Method with a Int parameter but no Return, age: " + age);
    }
    public static void main(String[] args){
        MethodPractice7_reuseMethod testPrint = new MethodPractice7_reuseMethod();
        testPrint.print();
        testPrint.print("Larry");
        testPrint.print(33);
    }
}
