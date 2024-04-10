package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));

        //Object 제공하는 equals 는 == 동일성 비교와 동일하다
        System.out.println("equals = " + (user1.equals(user2)));
    }
}
