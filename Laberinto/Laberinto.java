package laberinto;

import java.util.Scanner;

public class Laberinto {

    public static void main(String[] args) {

        Escenario esce = new Escenario();
        Metodo metodo = new Metodo();

        Scanner lector = new Scanner(System.in);
        int opc;
        int mod = 0;
        do {
            System.out.println("1.-Jugar");
            System.out.println("0.- Salir");
            System.out.println("Controles: Arriba: w, Derecha: d; Abajo: s; Izquierda: a");
            System.out.print("Opción:");
            opc = lector.nextInt();
            if (opc != 0) {
                System.out.println("1.- Manual");
                System.out.println("2.- Automatico");
                mod = lector.nextInt();
            }

            switch (opc) {
                case 0:
                    System.out.println("Adiós!");
                    break;
                case 1:
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenarioUno(), esce.filaasterico(esce.escenarioUno()), esce.columasterico(esce.escenarioUno()));
                    } else {
                        metodo.Auto(esce.escenarioUno(), esce.filaasterico(esce.escenarioUno()), esce.columasterico(esce.escenarioUno()));
                    }
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opc != 0);

    }
}
