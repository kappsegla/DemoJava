package se.iths.martin.collection;

import java.util.Collection;

public class Gen<T> {

   public T obj;

   public void set(T in) {
       obj = in;
   }

   public T get(){
       return obj;
   }
}