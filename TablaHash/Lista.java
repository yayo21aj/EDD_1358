package com.mycompany.tablahash;

public class Lista {
    
    private Nodo primero;
    private Nodo ultimo;
    
    public void Agregar (int valor) {
        Nodo nuevo = new Nodo ();
        nuevo.setValor (valor);
        
        if (primero != null) {
            ultimo.setSiguiente (nuevo);
            ultimo = nuevo;
        } else {
            primero = nuevo;
            ultimo = primero;
        }
    }
    
    public void Borrar (int valor) {
        if(primero != null) {
            if(primero.getValor() == valor) {
                primero = primero.getSiguiente();
            } else {
                Nodo borrar = primero.getSiguiente();
                Nodo anterior = primero;
                
                while (borrar != null) {
                    if(borrar.getValor() == valor) {
                        break;
                    }
                    anterior = borrar;
                    borrar = borrar.getSiguiente();
                } if (borrar != null) {
                    anterior.setSiguiente(borrar.getSiguiente());
                }
            }
        }
    }
    
    public void imprimir () {
        Nodo aux = primero;
        String texto = "";
        
        while (aux != null) {
            texto += aux.getValor() + "->";
            aux = aux.getSiguiente();
        }
        texto = texto.substring(0, texto.length() -2);
        System.out.println (texto);
    }
}
