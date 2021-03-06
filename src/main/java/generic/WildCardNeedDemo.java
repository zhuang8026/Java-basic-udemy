package generic;


public class WildCardNeedDemo {

    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<Integer>();
        intStack.push(1); // 1 is autoboxed into new Integer(1)
        intStack.push(2);
        intStack.push(-2);

        System.out.print("The max number is " + max(intStack));
//		System.out.print("The max number is " + maxV2(intStack));

    }

    /**
     * Find the maximum in a stack of numbers
     */
    public static double max(GenericStack<? extends Number> stack) {
        double max = stack.pop().doubleValue(); // initialize max

        while (!stack.isEmpty()) {
            double value = stack.pop().doubleValue();
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    public static int maxV2(GenericStack<? extends Integer> stackV2) {
        int value = stackV2.pop().intValue();
        return value;
    }
}
