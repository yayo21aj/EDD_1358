package com.mycompany.cola;

public class Nodo <T> {
    
    private T dato;
    private Nodo<T> siguiente;

    public Nodo() {
    }

    public Nodo(T _dato){

        this.dato = _dato;


    }

    public Nodo(T _dato, Nodo<T> _siguiente) {
        this.dato = _dato;
        this.siguiente = _siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "" + this.dato;
    }
}
