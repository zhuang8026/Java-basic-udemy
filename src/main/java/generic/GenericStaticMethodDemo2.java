package generic;

public class GenericStaticMethodDemo2 {

    public static void main(String[] args) {

        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"London", "Tokyo", "New York"};

        GenericStaticMethodDemo2.<String>print(strings);
        GenericStaticMethodDemo2.<Integer>printV2(integers);
    }

    public static <E extends String> void print(E[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static <E extends Integer> void printV2(E[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    // <E extends Object> === <E>
    public static <E extends Object> void printV3(E[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
