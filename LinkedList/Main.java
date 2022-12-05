package com.mycompany.linkedlist;
import java.util.Queue;
import java.util.LinkedList;

class Main {

    public static void main(String[] args) {
        // Creando la cola usando la clase LinkedList
        Queue<Integer> numbers = new LinkedList<>();

        // insertando elementos a la cola
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Cola: " + numbers);

        // Accediendo a los elementos de la cola
        int accessedNumber = numbers.peek();
        System.out.println("Elemento accedido: " + accessedNumber);

        // Removiendo elementos de la cola
        int removedNumber = numbers.poll();
        System.out.println("Elemento removido: " + removedNumber);

        System.out.println("Cola actualizada: " + numbers);
    }
}
