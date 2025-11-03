package estu.ceng.generics;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // --- Stack Demo ---
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Generics");
        stack.push("Lab");

        System.out.println("Stack boyutu: " + stack.size());
        System.out.println("En üstteki eleman (peek): " + stack.peek());
        System.out.println("Pop ile çıkarılan: " + stack.pop());
        System.out.println("Stack içeriği: " + stack);

        // --- MergeUtil Demo ---
        List<Integer> list1 = Arrays.asList(1, 3, 5);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 7);

        List<Integer> merged = MergeUtil.merge(list1, list2);
        System.out.println("Birleştirilmiş liste: " + merged);
    }
}
