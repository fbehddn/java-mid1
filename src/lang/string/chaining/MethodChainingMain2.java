package lang.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder.add(2);
        ValueAdder adder3 = adder.add(3);

        int result = adder3.getValue();
        System.out.println("result = " + result);

        // 모두 같은 주소값을 참조
        System.out.println("adder1 = " + adder1);
        System.out.println("adder1 = " + adder2);
        System.out.println("adder1 = " + adder3);
    }
}