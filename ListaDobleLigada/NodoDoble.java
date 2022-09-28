package com.mycompany.listadobleligada;

public class NodoDoble <T>{
    
    private T dato;
    private NodoDoble <T> siguiente, anterior;
    private NodoDoble <T> head;
    
    //Constructor cuando hay nodos
    public NodoDoble (T dato, NodoDoble <T> siguiente, NodoDoble <T> anterior){
      this.dato= dato;
      this.siguiente= siguiente;
      this.anterior = anterior;
    }
    
    //Constructor cuando no hay nodos
    public NodoDoble (T dato){
        this(dato,null,null);      
    }
    
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoDoble<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble<T> siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble<T> anterior) {
        this.anterior = anterior;
    }
    
    @Override
    public String toString() {   
        return "|"+dato+"| <-->"; 
    }
    
    public String printAll(){
        return "[Dato = " + dato + "] <--> [Siguiente : " + this.getSiguiente() + "]";
    }
}
