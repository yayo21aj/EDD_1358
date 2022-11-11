package com.mycompany.tablahash;

public class Principal {
    
    public static void main(String[] args) {
        
        MetodoHash h = new MetodoHash ();
        
        h.Add(38);
        h.Add(48);
        h.Add(98);
        h.Add(18);
        h.Add(1);
        h.Add(25);
        h.Add(78);
        h.Add(55);
        h.Add(16);
        h.Add(13);
        h.Add(3);
        h.Add(63);
        h.Add(67);
        h.Add(79);
        h.Add(75);
        h.Add(95);
        h.Add(5);
        h.imprimir();
        
        h.Remove(1);
        h.Remove(3);
        h.Remove(5);
        h.imprimir();
    }
}
