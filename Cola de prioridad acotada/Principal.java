package com.mycompany.colaacotada;

public class Principal {
    
    public static void main(String[] args) {
    
        ColaAcotada <String> cola = new ColaAcotada(7);
        cola.enqueue(4, "Maestre");
        cola.enqueue(2, "Niños");
        cola.enqueue(4, "Mecanico");
        cola.enqueue(3, "Hombres");
        cola.enqueue(4, "Vigia");
        cola.enqueue(5, "Capitan");
        cola.enqueue(4, "Timonel");
        cola.enqueue(3, "Mujeres");
        cola.enqueue(2, "3ra edad");
        cola.enqueue(1, "Niñas");
        cola.dequeue();
        cola.dequeue();
        cola.dequeue();
        cola.dequeue();
        cola.dequeue();
        cola.dequeue();
        cola.dequeue();
        cola.dequeue();
        cola.dequeue();
        cola.dequeue();
        
        while(!cola.isEmpty()){
            System.out.printf("%s estan en el barco %n", cola.dequeue());
        }
    }
}
