package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10");
        int intValue = Integer.parseInt("10");

        int compareResult = i1.compareTo(20);


        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("intValue = " + intValue);
        System.out.println("compareResult = " + compareResult);
        System.out.println("sum: " + Integer.sum(10, 20));
        System.out.println("min: " + Integer.min(10, 20));
        System.out.println("max: " + Integer.max(10, 20));
    }
}
