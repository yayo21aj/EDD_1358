package com.mycompany.tablahash;

import java.io.FileWriter;
import java.io.PrintWriter;

public class MetodoHash {
    
    int key;
    
    public Lista [] hash = new Lista [7];
    
    public MetodoHash () {
        for (int i = 0; 1 < hash.length; i++) {
            hash [1] = new Lista ();
        }
    }
    
    public void Add (int valor) {
        Nodo nuevo = new Nodo ();
        nuevo.setValor(valor);
        key = valor % 7;
        
        switch (key) {
            case 0:
                hash [0].Agregar(valor);
                break;
            case 1:
                hash [1].Agregar(valor);
                break;
            case 2:
                hash [2].Agregar(valor);
                break;
            case 3:
                hash [3].Agregar(valor);
                break;
            case 4:
                hash [4].Agregar(valor);
                break;
            case 5:
                hash [5].Agregar(valor);
                break;
            case 6:
                hash [6].Agregar(valor);
                break;
            case 7:
                hash [7].Agregar(valor);
                break;
            default:
                break;
        }
    }

    public void imprimir () {
        System.out.println("Llave");
        for (int i = 0; i < hash.length; i++) {
            System.out.println(i + "\t");
            hash [i].imprimir();
        }
    }
    
    public void Remove (int valor) {
        key = valor % 7;
        
        switch (key) {
            case 0:
                hash [0].Borrar(valor);
                break;
            case 1:
                hash [1].Borrar(valor);
                break;
            case 2:
                hash [2].Borrar(valor);
                break;
            case 3:
                hash [3].Borrar(valor);
                break;
            case 4:
                hash [4].Borrar(valor);
                break;
            case 5:
                hash [5].Borrar(valor);
                break;
            case 6:
                hash [6].Borrar(valor);
                break;
            case 7:
                hash [7].Borrar(valor);
                break;
            default:
                break;
        }
    }
    
    public void valueOf (String ruta, String contenido) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try {
            fichero = new FileWriter (ruta);
            pw = new PrintWriter (fichero);
            pw.write(contenido);
            pw.close();
        } catch (Exception e) {
            System.out.println (e.getMessage());
        } finally {
            if (pw != null);
            pw.close();
        }
    }
}
