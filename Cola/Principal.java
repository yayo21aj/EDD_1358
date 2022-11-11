package com.mycompany.cola;

public class Principal {

    public static void main(String[] args) {

        Cola<Integer> lista = new Cola<>();

        lista.enqueue(9);
        lista.enqueue(3);
        lista.enqueue(5);
        lista.enqueue(999);
        lista.enqueue(1);
        lista.dequeue();
        lista.dequeue();
        lista.to_String();
    }
    
}
