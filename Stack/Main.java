package com.mycompany.stack;
import java.util.ArrayDeque;

class Main {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();

        // Insertando elementos en la pila
        stack.push("Perro");
        stack.push("Gato");
        stack.push("Caballo");
        System.out.println("Pila: " + stack);

        // Accediendo al elemento que esta arriba de la pila
        String element = stack.peek();
        System.out.println("Elemento accedido: " + element);

        // Remueve el elemento que este arriba de la cola
        String remElement = stack.pop();
        System.out.println("Elemento removido: " + remElement);
    }
}
