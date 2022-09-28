package com.mycompany.listadobleligada;

public class Main {
    
    public static void main(String[] args) {
        ListaDobleADT <Integer> ld = new ListaDobleADT();
        ld.agregarAlInicio (69);
        ld.agregarDespuesDe(15,1);
        ld.agregarAlFinal(4);
        ld.agregarDespuesDe(2, 2);
        ld.agregarAlInicio(5);
        ld.eliminarElPrimero();
        ld.eliminar(2);
        ld.transversal();
    }
}
