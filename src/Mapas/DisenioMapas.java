package Mapas;

import Planetas.*;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class DisenioMapas {

    int filas, columnas, planetasNeutrales;                                                     //declaracion de variables
    String Jugador1, Jugador2;
    Planeta[][] matriz;
    Random random = new Random();

    String nombre[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public void MapaAleatorio(int filas, int columnas, int planetasNeutrales, String Jugador1, String Jugador2) {
        this.filas = filas;
        this.columnas = columnas;
        matriz = new Planeta[filas][columnas];                                                  //creando la matriz de tipo planeta para el mapa

        boolean bandera = true;

        int n = 0;
        String conquistador = "Neutral";

        while (bandera) {                                                           //inicio ciclo para colocar planetas
            double rMuerte = 0.1 + (0.9999 - 0.1) * random.nextDouble();                 //random de porcentaje de muerte
            double pMuerte = Math.round(rMuerte * 100d) / 100d;                         //guardar el porcentaje de muerte

            int rDinero = 100 + random.nextInt(400);                                 //dinero del planeta
            int rFilas = random.nextInt(filas);                                     //generar posicion aleatoria de filas para el planeta
            int rColumnas = random.nextInt(columnas);                               //generar posicion aleatoria de columnas para el planeta
            int rGeneral = random.nextInt(100);                                     //porcentaje de aparcion de planetas

            if (n == planetasNeutrales) {
                conquistador = Jugador1;
            } else if (n == planetasNeutrales + 1) {
                conquistador = Jugador2;
            }

            if (matriz[rFilas][rColumnas] instanceof Tierra || matriz[rFilas][rColumnas] instanceof Fuego || matriz[rFilas][rColumnas] instanceof Organico || matriz[rFilas][rColumnas] instanceof Radioactivo || matriz[rFilas][rColumnas] instanceof Agua) {

            } else if (matriz[rFilas][rColumnas] == null) {

                if (rGeneral >= 0 && rGeneral < 45) {
                    matriz[rFilas][rColumnas] = new Tierra(nombre[n], pMuerte, rDinero, conquistador);
                    n++;
                } else if (rGeneral >= 45 && rGeneral < 60) {
                    matriz[rFilas][rColumnas] = new Fuego(nombre[n], pMuerte, rDinero, conquistador);
                    n++;
                } else if (rGeneral >= 60 && rGeneral < 70) {
                    matriz[rFilas][rColumnas] = new Organico(nombre[n], pMuerte, rDinero, conquistador);
                    n++;
                } else if (rGeneral >= 70 && rGeneral < 75) {
                    matriz[rFilas][rColumnas] = new Radioactivo(nombre[n], pMuerte, rDinero, conquistador);
                    n++;

                } else if (rGeneral >= 75 && rGeneral < 100) {
                    matriz[rFilas][rColumnas] = new Agua(nombre[n], pMuerte, rDinero, conquistador);
                    n++;
                }

            }
            if (n == planetasNeutrales + 2) {
                bandera = false;
            }

        }

        rellenarCampo();
        Juego j = new Juego(matriz);
        j.menu2();
    }

    public void MapaManual(int filas, int columnas, int planetasNeutrales, String Jugador1, String Jugador2) {
        Scanner leerInt = new Scanner(System.in);
        Scanner leerString = new Scanner(System.in);
        this.filas = filas;
        this.columnas = columnas;
        matriz = new Planeta[filas][columnas];
        int rGeneral = random.nextInt(100);
        double rMuerte = 0.1 + (0.9999 - 0.1) * random.nextDouble();                 //random de porcentaje de muerte
        double pMuerte = Math.round(rMuerte * 100d) / 100d;                         //guardar el porcentaje de muerte

        boolean bandera = true;
        Random random = new Random();

        int n = 0;
        String conquistador = "Neutral";

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int TipoPlaneta = 0;
                if (rGeneral >= 0 && rGeneral < 45) {
                    TipoPlaneta = 1;
                    n++;
                } else if (rGeneral >= 45 && rGeneral < 60) {
                    TipoPlaneta = 2;
                    n++;
                } else if (rGeneral >= 60 && rGeneral < 70) {
                    TipoPlaneta = 3;
                    n++;
                } else if (rGeneral >= 70 && rGeneral < 75) {
                    TipoPlaneta = 4;
                    n++;

                } else if (rGeneral >= 75 && rGeneral < 100) {
                    TipoPlaneta = 5;
                    n++;
                }

                System.out.println("Quien será el dueño del planeta " + i + "," + j);
                System.out.println("1) Neutral\n2) " + Jugador1 + "\n3) " + Jugador2);
                int NumConquistador = leerInt.nextInt();
                String Conquistador = null;
                switch (NumConquistador) {
                    case 1:
                        Conquistador = "Neutral";
                        break;
                    case 2:
                        Conquistador = Jugador1;
                        break;
                    case 3:
                        Conquistador = Jugador2;
                        break;
                    default:
                        break;
                }

                System.out.println("Escriba el nombre del planeta:");
                String nombre = leerString.nextLine();

                System.out.println("Escriba la cantidad dinero que desea entre 100 y 500");
                int Dinero = leerInt.nextInt();

                crearPlaneta(TipoPlaneta, nombre, Conquistador, Dinero, i, j);
            }
        }

        rellenarCampo();
        Juego j = new Juego(matriz);
        j.menu2();
    }

    public void rellenarCampo() {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] instanceof Tierra) {
                    System.out.print("     " + matriz[i][j].getNombre() + matriz[i][j].getConquistador() + "       ");
                } else if (matriz[i][j] instanceof Fuego) {
                    System.out.print("     " + matriz[i][j].getNombre() + matriz[i][j].getConquistador() + "       ");
                } else if (matriz[i][j] instanceof Organico) {
                    System.out.print("     " + matriz[i][j].getNombre() + matriz[i][j].getConquistador() + "       ");
                } else if (matriz[i][j] instanceof Radioactivo) {
                    System.out.print("     " + matriz[i][j].getNombre() + matriz[i][j].getConquistador() + "       ");
                } else if (matriz[i][j] instanceof Agua) {
                    System.out.print("     " + matriz[i][j].getNombre() + matriz[i][j].getConquistador() + "       ");
                } else {
                    System.out.print("   " + "___________" + "      " + "     ");
                }
            }
            System.out.println("\n");
        }
    }

    public void crearPlaneta(int TipoPlaneta, String nombre, String Conquistador, int Dinero, int Fila, int Columna) {
        double rMuerte = 0.1 + (0.9999 - 0.1) * random.nextDouble();                 //random de porcentaje de muerte
        double pMuerte = Math.round(rMuerte * 100d) / 100d;                         //guardar el porcentaje de muerte

        switch (TipoPlaneta) {
            case 1:
                matriz[Fila][Columna] = new Tierra(nombre, pMuerte, Dinero, Conquistador);
                break;
            case 2:
                matriz[Fila][Columna] = new Fuego(nombre, pMuerte, Dinero, Conquistador);
                break;
            case 3:
                matriz[Fila][Columna] = new Organico(nombre, pMuerte, Dinero, Conquistador);
                break;
            case 4:
                matriz[Fila][Columna] = new Radioactivo(nombre, pMuerte, Dinero, Conquistador);
                break;
            case 5:
                matriz[Fila][Columna] = new Agua(nombre, pMuerte, Dinero, Conquistador);
                break;
            default:
                matriz[Fila][Columna] = null;
                break;
        }
    }

}