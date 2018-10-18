package genericsandthreads;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void pushObjectIncreasesQueueSizeByOne() {
        Queue<String> queue = new Queue<>();
        int startSize = queue.size();
        queue.push("Test");
        assertEquals(startSize + 1, queue.size());
    }

    @Test
    void firstReturnsFirstElementInQueue() {
        Queue<String> queue = new Queue<>();
        queue.push("Test");
        int startSize = queue.size();
        String ret = queue.first();
        assertEquals("Test", ret);
        assertEquals(startSize - 1,queue.size());
    }

//    @Test
//    void firstOnEmptyQueueReturnsNull() {
//        Queue<String> queue = new Queue<>();
//        String ret = queue.first();
//        assertNull(ret);
//    }


    @Test
    void sizeOnNewQueueReturnsZero() {
        Queue<String> queue = new Queue<>();
        assertEquals(0, queue.size());
    }
}