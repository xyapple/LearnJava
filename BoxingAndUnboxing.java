public class BoxingAndUnboxing {
    public static void main(String[] args) {
        System.out.println("new Integer(2)==2 result: "+(new Integer(2)==2));
        System.out.println("new Integer(2)== new Integer(2) result: "+(new Integer(2)== new Integer(2)));
        System.out.println("Integer.valueOf(2) = Integer.valueOf(2) result: " + (Integer.valueOf(2) == Integer.valueOf(2)));
        System.out.println("Integer.valueOf(2).intValue()==2 resul: " + (Integer.valueOf(2).intValue()==2));
        System.out.println("new Integer(2).equals(new Integer(2)) result: "+ (new Integer(2).equals(new Integer(2))) );
        System.out.println(
                "Integer.valueOf(100) == Integer.valueOf(100) result: "
                        + (Integer.valueOf(100) == Integer.valueOf(100)));
        System.out.println(
                "Integer.valueOf(1000) == Integer.valueOf(1000) result: "
                        + (Integer.valueOf(1000) == Integer.valueOf(1000)));

    }
}
