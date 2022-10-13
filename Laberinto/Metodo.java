package laberinto;

import java.util.Scanner;

public class Metodo {

    Scanner lector = new Scanner(System.in);

    public void Avanzar(String[][] matriz, int filas, int colum) {
        String labe = "x";
        int golpes = 0;
        Escenario x = new Escenario();
        int []arreglo = x.posX(matriz);
        while (golpes < 5) {
            if (matriz[filas][colum] == matriz[arreglo[0]][arreglo[1]]) {
                System.out.println("HAS GANADO !!");
                golpes += 5;
            } else {
                imprimirMatriz(matriz);
                System.out.print("Mover -> ");
                String cara = lector.next();
                //Derecha
                if (cara.equalsIgnoreCase("d")) {
                    if (!matriz[filas][colum + 1].equals("1") && !matriz[filas][colum + 1].equals("|") && !matriz[filas][colum + 1].equals("-")) {
                        matriz[filas][colum + 1] = "*";
                        matriz[filas][colum] = " ";
                        colum++;
                    } else {
                        golpes++;
                        System.out.println("Has golpeado " + golpes + " de 5 con la pared ");
                    }
                }

                //izquierda
                if (cara.equalsIgnoreCase("a")) {
                    if (!matriz[filas][colum - 1].equals("1") && !matriz[filas][colum - 1].equals("|") && !matriz[filas][colum - 1].equals("-")) {
                        matriz[filas][colum - 1] = "*";
                        matriz[filas][colum] = " ";
                        colum--;
                    } else {
                        golpes++;
                        System.out.println("Has golpeado " + golpes + " de 5 con la pared ");
                    }
                }

                //arriba
                if (cara.equalsIgnoreCase("w")) {
                    if (!matriz[filas - 1][colum].equals("1") && !matriz[filas - 1][colum].equals("|") && !matriz[filas - 1][colum].equals("-")) {
                        matriz[filas - 1][colum] = "*";
                        matriz[filas][colum] = " ";
                        filas--;
                    } else {
                        golpes++;
                        System.out.println("Has golpeado " + golpes + " de 5 con la pared ");
                    }
                }

                //abajo
                if (cara.equalsIgnoreCase("s")) {
                    if (!matriz[filas + 1][colum].equals("1") && !matriz[filas + 1][colum].equals("|") && !matriz[filas + 1][colum].equals("-")) {
                        matriz[filas + 1][colum] = "*";
                        matriz[filas][colum] = " ";
                        filas++;
                    } else {
                        golpes++;
                        System.out.println("Has golpeado " + golpes + " de 5 con la pared ");
                    }
                }
            }
        }
    }

    public void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void Auto(String[][] matriz, int filas, int colum) {
        String labe = "x";
        String direccion = "derecha";
        Escenario x = new Escenario();
        int []arreglo = x.posX(matriz);
        while (matriz[filas][colum] != matriz[arreglo[0]][arreglo[1]]) {
            imprimirMatriz(matriz);
            switch (direccion) {
                case "derecha":
                    if (!matriz[filas - 1][colum].equals("1") && !matriz[filas - 1][colum].equals("|") && !matriz[filas-1][colum].equals("-")) {
                        matriz[filas - 1][colum] = "*";
                        matriz[filas][colum] = " ";
                        filas--;
                        direccion = "arriba";
                    } else {
                        if (!matriz[filas][colum + 1].equals("1") && !matriz[filas][colum + 1].equals("|") && !matriz[filas][colum + 1].equals("-")) {
                            matriz[filas][colum + 1] = "*";
                            matriz[filas][colum] = " ";
                            colum++;
                        } else {
                            if (!matriz[filas + 1][colum].equals("1") && !matriz[filas + 1][colum].equals("|") && !matriz[filas+1][colum].equals("-")) {
                                matriz[filas + 1][colum] = "*";
                                matriz[filas][colum] = " ";
                                filas++;
                                direccion = "abajo";
                            } else {
                                matriz[filas][colum - 1] = "*";
                                matriz[filas][colum] = " ";
                                colum--;
                                direccion = "izquierda";
                            }
                        }
                    }
                    break;
                case "arriba":
                    if (!matriz[filas][colum - 1].equals("1") && !matriz[filas][colum - 1].equals("|") && !matriz[filas][colum - 1].equals("-")) {
                        matriz[filas][colum - 1] = "*";
                        matriz[filas][colum] = " ";
                        colum--;
                        direccion = "izquierda";
                    } else {
                        if (!matriz[filas - 1][colum].equals("1") && !matriz[filas - 1][colum].equals("|") && !matriz[filas-1][colum].equals("-")) {
                            matriz[filas - 1][colum] = "*";
                            matriz[filas][colum] = " ";
                            filas--;
                        } else {
                            if (!matriz[filas][colum + 1].equals("1") && !matriz[filas][colum + 1].equals("|") && !matriz[filas][colum + 1].equals("-")) {
                                matriz[filas][colum + 1] = "*";
                                matriz[filas][colum] = " ";
                                colum++;
                                direccion = "derecha";
                            } else {
                                matriz[filas + 1][colum] = "*";
                                matriz[filas][colum] = " ";
                                filas++;
                                direccion = "abajo";
                            }
                        }
                    }
                    break;
                case "izquierda":
                    if (!matriz[filas + 1][colum].equals("1") && !matriz[filas + 1][colum].equals("|") && !matriz[filas+1][colum].equals("-")) {
                        matriz[filas + 1][colum] = "*";
                        matriz[filas][colum] = " ";
                        filas++;
                        direccion = "abajo";
                    } else {
                        if (!matriz[filas][colum - 1].equals("1") && !matriz[filas][colum - 1].equals("|") && !matriz[filas][colum - 1].equals("-")) {
                            matriz[filas][colum - 1] = "*";
                            matriz[filas][colum] = " ";
                            colum--;
                        } else {
                            if (!matriz[filas - 1][colum].equals("1") && !matriz[filas - 1][colum].equals("|") && !matriz[filas-1][colum].equals("-")) {
                                matriz[filas - 1][colum] = "*";
                                matriz[filas][colum] = " ";
                                filas--;
                                direccion = "arriba";
                            } else {
                                matriz[filas][colum + 1] = "*";
                                matriz[filas][colum] = " ";
                                colum++;
                                direccion = "derecha";
                            }
                        }
                    }
                    break;

                case "abajo":
                    if (!matriz[filas][colum + 1].equals("1") && !matriz[filas][colum + 1].equals("|") && !matriz[filas][colum + 1].equals("-")) {
                        matriz[filas][colum + 1] = "*";
                        matriz[filas][colum] = " ";
                        colum++;
                        direccion = "derecha";
                    } else {
                        if (!matriz[filas + 1][colum].equals("1") && !matriz[filas + 1][colum].equals("|") && !matriz[filas+1][colum].equals("-")) {
                            matriz[filas + 1][colum] = "*";
                            matriz[filas][colum] = " ";
                            filas++;
                        } else {
                            if (!matriz[filas][colum - 1].equals("1") && !matriz[filas][colum - 1].equals("|") && !matriz[filas][colum - 1].equals("-")) {
                                matriz[filas][colum - 1] = "*";
                                matriz[filas][colum] = " ";
                                colum--;
                                direccion = "izquierda";
                            } else {
                                matriz[filas - 1][colum] = "*";
                                matriz[filas][colum] = " ";
                                filas--;
                                direccion = "arriba";
                            }
                        }
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            try {
                Thread.sleep(250);
            }
            catch(InterruptedException e) {
                System.out.println("Thread Interrupted");
            } 
        }
        imprimirMatriz(matriz);
        System.out.println("Ha llegado a la salida");
    }
}
