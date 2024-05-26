package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
//        Random random = new Random();
        Random random = new Random(1);

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double v = random.nextDouble();
        System.out.println("v = " + v);

        boolean b = random.nextBoolean();
        System.out.println("b = " + b);

        int randomRange = random.nextInt(10);
        System.out.println("randomRange = " + randomRange);

        int randomRange2 = random.nextInt(10) + 1;
        System.out.println("randomRange2 = " + randomRange2);
    }
}
