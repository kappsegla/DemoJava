package se.iths.martin.collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MyStorage<T> implements DoIt<String>{

    Object[] storage;
    int count;

    MyStorage(){
        storage = new Object[10];
    }

    public void forEach(Consumer<? super T> consumer){

        for (int i = 0; i < size() ; i++) {
            consumer.accept(get(i));
        }

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

    @Override
    public String doSomething(String text) {
        System.out.println(text + size());
        return "";
    }
}
