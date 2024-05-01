package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruit = "apple,banana,mango";

        //분리하기
        String[] split = fruit.split(",");
        for (String s : split) {
            System.out.println(s);
        }

        //합체하기
        String joinedString = String.join("->", split);
        System.out.println(joinedString);
    }
}
