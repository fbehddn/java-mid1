package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //splie()
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        // join()
        String join = String.join("-", "A", "B", "C");
        System.out.println(join);

        //문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println("result = " + result);
    }
}
