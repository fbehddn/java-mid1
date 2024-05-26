package lang.math;

public class MathMain {
    public static void main(String[] args) {
        System.out.println("max(10,20): " + Math.max(10, 20));
        System.out.println("min(10,20): " + Math.min(10, 20));
        System.out.println("abs(10,20): " + Math.abs(-20));

        System.out.println(Math.ceil(2.1));
        System.out.println(Math.floor(2.1));
        System.out.println(Math.round(2.1));
        System.out.println(Math.round(2.6));

        System.out.println(Math.sqrt(4));
        System.out.println(Math.random());
    }
}
