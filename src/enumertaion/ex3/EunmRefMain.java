package enumertaion.ex3;

import javax.management.ObjectName;

import static enumertaion.ex3.Grade.*;

public class EunmRefMain {
    public static void main(String[] args) {
        System.out.println("Grade.BASIC.getClass() = " + BASIC.getClass());
        System.out.println("Grade..getClass() = " + GOLD.getClass());
        System.out.println("Grade.DIAMOND.getClass() = " + DIAMOND.getClass());

        System.out.println("ref BASIC = " + refValue(BASIC));
        System.out.println("ref GOLD = " + refValue(GOLD));
        System.out.println("ref DIAMOND = " + refValue(DIAMOND));
    }

    private static String refValue(Object grade) {
        return Integer.toHexString((System.identityHashCode(grade)));
    }
}
