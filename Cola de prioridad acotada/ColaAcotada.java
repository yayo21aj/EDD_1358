package com.mycompany.colaacotada;

import java.util.ArrayList;

public class Cola  <T>{
    
    private final ArrayList<T> college;
    private int size;

   
    public Cola() {
        college = new ArrayList();
    }
  
    public boolean isEmpty() {
        return size == 0;
    }
   
    public int size(){
        return size;
    }
    
    public void enqueue(T element){
        college.add(size++, element);
    }

    public T dequeue(){
        T out = null;
        if (!this.isEmpty()) {
            out = college.remove(0);
            size--;
        }
       return out;
    }

    @Override
    public String toString() {
        String out = "";
        if (!this.isEmpty()) {
          out = college.stream().map(element -> ","+ element).reduce(out, String::concat);
        return "{" + out.substring(1) + "}";  
        }
        return "{" + out+ "}";
    }
}
