package estu.ceng.generics;

import org.junit.jupiter.api.Test;
import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void pushPopPeekWorks() {
        Stack<String> stack = new Stack<>();
        assertTrue(stack.isEmpty());
        stack.push("a");
        stack.push("b");

        assertEquals(2, stack.size());
        assertEquals("b", stack.peek());
        assertEquals("b", stack.pop());
        assertEquals("a", stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void popOnEmptyThrows() {
        Stack<Integer> stack = new Stack<>();
        assertThrows(EmptyStackException.class, stack::pop);
    }
}
