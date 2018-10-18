package genericsandthreads;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void push() {
        Queue<String> queue = new Queue<>();
        int startSize = queue.size();
        queue.push("Test");
        assertEquals(startSize + 1, queue.size());
    }

    @Test
    void first() {
        Queue<String> queue = new Queue<>();
        queue.push("Test");
        String ret = queue.first();
        assertEquals("Test", ret);
    }

    @Test
    void size() {
        Queue<String> queue = new Queue<>();
        assertEquals(0, queue.size());
    }
}