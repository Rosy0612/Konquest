package Mapas;

import Planetas.*;
import java.text.DecimalFormat;
import java.util.Random;

public class DisenioMapas {

    int filas, columnas, planetasNeutrales;
    String Jugador1, Jugador2;
    Planeta[][] matriz;
    String nombre[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    public void Mapa(int filas, int columnas, int planetasNeutrales, String Jugador1, String Jugador2) {
        this.filas = filas;
        this.columnas = columnas;
        matriz = new Planeta[filas][columnas];
         

        boolean bandera = true;
        Random random = new Random();

        int n = 0;
        String conquistador = "Neutral"; 

        while (bandera) {                                                           //inicio ciclo para colocar planetas
            double rMuerte = 0.1+(0.9999-0.1)* random.nextDouble();                 //random de porcentaje de muerte
            double pMuerte = Math.round(rMuerte*100d)/100d;                         //guardar el porcentaje de muerte
            
            int rDinero = 100+ random.nextInt(400);                                 //dinero del planeta
            int rFilas = random.nextInt(filas);                                     //generar posicion aleatoria de filas para el planeta
            int rColumnas = random.nextInt(columnas);                               //generar posicion aleatoria de columnas para el planeta
            int rGeneral = random.nextInt(100);                                     //porcentaje de aparcion de planetas
            System.out.println(rGeneral);
            System.out.println(rColumnas);
            System.out.println(rFilas);
            if (n == planetasNeutrales){
            conquistador = Jugador1;
            }else if (n== planetasNeutrales+1) {
                conquistador = Jugador2;
            }

            if (matriz[rFilas][rColumnas] instanceof Tierra || matriz[rFilas][rColumnas] instanceof Fuego || matriz[rFilas][rColumnas] instanceof Organico || matriz[rFilas][rColumnas] instanceof Radioactivo || matriz[rFilas][rColumnas] instanceof Agua) {

            } else if (matriz[rFilas][rColumnas] == null) {

                if (rGeneral >= 0 && rGeneral < 45) {
                    matriz[rFilas][rColumnas] = new Tierra(nombre[n],pMuerte,rDinero, conquistador);
                    n++;
                } else if (rGeneral >= 45 && rGeneral < 60) {
                    matriz[rFilas][rColumnas] = new Fuego(nombre[n],pMuerte,rDinero, conquistador);
                    n++;
                } else if (rGeneral >= 60 && rGeneral < 70) {
                    matriz[rFilas][rColumnas] = new Organico(nombre[n],pMuerte,rDinero, conquistador);
                    n++;
                } else if (rGeneral >= 70 && rGeneral < 75) {
                    matriz[rFilas][rColumnas] = new Radioactivo(nombre[n],pMuerte,rDinero, conquistador);
                    n++;

                } else if (rGeneral >= 75 && rGeneral < 100) {
                    matriz[rFilas][rColumnas] = new Agua(nombre[n],pMuerte,rDinero, conquistador);
                    n++;
                }
                
            }
            if (n == planetasNeutrales+2) {
                bandera = false;
            }

        }

        rellenarCampo();
    }

    public void rellenarCampo() {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] instanceof Tierra) {
                    System.out.print("     " + matriz[i][j].getTierra() + "       ");
                } else if (matriz[i][j] instanceof Fuego) {
                    System.out.print("     " + matriz[i][j].getFuego() + "       ");
                } else if (matriz[i][j] instanceof Organico) {
                    System.out.print("     " + matriz[i][j].getOrganico() + "       ");
                } else if (matriz[i][j] instanceof Radioactivo) {
                    System.out.print("     " + matriz[i][j].getRadioactivo() + "       ");
                } else if (matriz[i][j] instanceof Agua) {
                    System.out.print("     " + matriz[i][j].getAgua() + "       ");
                } else {
                    System.out.print("   " + "___________" + "     ");
                }
            }
            System.out.println("\n");
        }
    }
}
