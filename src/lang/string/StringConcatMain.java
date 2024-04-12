package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello"; // x001
        String b = "java"; // x002

        String result1 = a.concat(b);
        String result2 = a + b; //x001 + x002 너무 자주 다루어지기 때문에 특별히 허용

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

    }
}
