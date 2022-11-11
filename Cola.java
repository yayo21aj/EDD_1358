package com.mycompany.cola;

public class Cola <T> {

    private Nodo<T> dato;
    private static int elementos;


    public Cola() {
        this.dato = null;
        this.elementos = 0;

    }

    public boolean is_empty() {

        return this.dato == null;
    }

    public int length() {

        return elementos;

    }

    public void enqueue(T valor) {

        Nodo nuevoElemento = new Nodo(valor);

        if (this.is_empty()) {

            this.dato = nuevoElemento;

        } else {
            Nodo aux = this.dato;

            while (aux.getSiguiente() != null) {

                aux = aux.getSiguiente();
            }

            aux.setSiguiente(nuevoElemento);
            //aux = nuevoElemento;
        }
        elementos++;

    }

    public void dequeue() {

        Nodo aux = this.dato;
        this.dato = aux.getSiguiente();
        elementos--;

    }


    public void to_String() {

        Nodo auxPrint = this.dato;

        while (auxPrint != null) {            
            System.out.print(auxPrint+", ");
            auxPrint = auxPrint.getSiguiente();
        }

    }

}
