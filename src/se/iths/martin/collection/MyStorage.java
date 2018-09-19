package se.iths.martin.collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MyStorage<T> {

    Object[] storage;
    int count;

    MyStorage(){
        storage = new Object[10];
    }

    public void add(T obj){
        //TODO: Check so array has free space
        if( count >= storage.length)
        {
            //Increase size with 50%
            storage = Arrays.copyOf(storage, storage.length * 3 / 2 );
        }
        storage[count++] = obj;
    }

    public T get(int i){
        if( i < 0 || i >= size()){
            throw new IndexOutOfBoundsException();
        }
        return (T)storage[i];
    }

    public int size(){
        return count;
    }

    public void clear(){
        count = 0;
    }




}
