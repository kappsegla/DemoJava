package genericsandthreads;

import java.util.ArrayList;
import java.util.Objects;

public class Queue<T> {

    ArrayList<T> list = new ArrayList<>();

    /**
     * Add object last in queue
     * @param object Object to put last in queue
     */
    public void push(T object) {


    }

    /**
     * Return first object from queue and removes it
     * @return first object from queue
     */
    public T first() {
        return null;
    }

    /**
     * Return the number of objects stored in queue
     * @return queue size
     */
    public int size(){
        return list.size();
    }
}
