package com.mycompany.arraylist;
import java.util.List;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        //Creando la lista usando la clase ArrayList
        List<Integer> numbers = new ArrayList<>();

        // Agregando los elemento a la lista
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Lista: " + numbers);

        // Accediendo al elemento de la lista
        int number = numbers.get(2);
        System.out.println("Elemento accedido: " + number);

        // Removiendo un elemento de la lista
        int removedNumber = numbers.remove(1);
        System.out.println("Elemento removido: " + removedNumber);
    }
}
