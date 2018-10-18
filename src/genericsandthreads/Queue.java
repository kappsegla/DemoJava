package genericsandthreads;

import java.util.ArrayList;
import java.util.Objects;

public class Queue<T> {

    ArrayList<T> list = new ArrayList<>();

    /**
     * Add object last in queue
     * @param object Object to put last in queue
     */
    public synchronized void push(T object) {
        list.add(object);
        notify();
    }

    /**
     * Return first object from queue if present otherwise blocks and waits
     * @return first object from queue
     */
    public synchronized T first() {
        while( size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return list.remove(0);
    }

    /**
     * Return the number of objects stored in queue
     * @return queue size
     */
    public int size(){
        return list.size();
    }
}
