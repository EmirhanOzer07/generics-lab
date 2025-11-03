package estu.ceng.generics;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Generics");
        stack.push("Lab");

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack contents: " + stack);

        List<Integer> list1 = Arrays.asList(1, 3, 5);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 7);

        List<Integer> merged = MergeUtil.merge(list1, list2);
        System.out.println("Merged list: " + merged);
    }
}
