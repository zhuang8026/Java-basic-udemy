package generic;

public class SuperWildCardDemo {

    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<String>();
        GenericStack<Object> stack2 = new GenericStack<Object>();
        // 注意：
        // 請把  GenericStack<Object> xxxx 看作一個整體
        // 對於 stack2 而言，stack2並不是stack1父類，所以才需要用到 <? extends T>，來統一 stack1 stack2 傳入參數
        stack2.push("Java");
        stack2.push(2);
        stack1.push("Sun");
        add(stack1, stack2);
        AnyWildCardDemo.print(stack2);
    }

    public static <T> void add(GenericStack<T> stack1, GenericStack<? super T> stack2) {
        // T = type， E = element
        // <? super T> 指定了 stack1 中的元素 是 stack2 的子類
        // 請注意，T 是泛型：Integer, Obeject ...
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
}