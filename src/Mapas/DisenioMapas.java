package Mapas;

import Planetas.*;
import java.util.Random;

public class DisenioMapas {

    int filas, columnas, planetasNeutrales;
    String Jugador1, Jugador2;
    int J1 = 1, J2 = 1, n = planetasNeutrales;
    Planeta Tierra;
    Planeta[][] matriz;

    public void Mapa(int filas, int columnas, int planetasNeutrales, String Jugador1, String Jugador2) {
        this.filas = filas;
        this.columnas = columnas;
        matriz = new Planeta[filas][columnas];

        //for (int i = 0; i < filas - 2; i++) {
        //  for (int j = 0; j < columnas; j++) {
        //    matriz[i][j] = new Tierra();
        //}
        //}
        //for (int i = filas - 2; i < filas; i++) {
        //  for (int j = 0; j < columnas; j++) {
        //    matriz[i][j] = new Fuego();
        //}
        //}
        boolean bandera = true;
        Random random = new Random();
//        int nTierra = planetasNeutrales/45;
//        int nFuego = planetasNeutrales/15;
//        int nOrganico = planetasNeutrales/10;
//        int nRadioactivo= planetasNeutrales/5;
//        int nAgua= planetasNeutrales/25;

        int rFilas = random.nextInt(filas);
        int rColumnas = random.nextInt(columnas);
//        int rTierra = random.nextInt(nTierra);
//        int rFuego = random.nextInt(nFuego);
//        int rOrganico = random.nextInt(nOrganico);
//        int rRadioactivo = random.nextInt(nRadioactivo);
//        int rAgua = random.nextInt(nAgua);
        int n = 0;
        // int planetaGanador=0;

        while (bandera) {
            int rGeneral = random.nextInt(100);

            if (matriz[rFilas][rColumnas] instanceof Tierra || matriz[rFilas][rColumnas] instanceof Fuego || matriz[rFilas][rColumnas] instanceof Organico || matriz[rFilas][rColumnas] instanceof Radioactivo || matriz[rFilas][rColumnas] instanceof Agua) {

            } else if (matriz[rFilas][rColumnas] == null) {

                if (rGeneral > 0 && rGeneral < 45) {
                    System.out.print("Tierra");
                    n++;
                } else if (rGeneral > 45 && rGeneral < 60) {
                    System.out.print("Fuego");
                    n++;
                } else if (rGeneral > 60 && rGeneral < 70) {
                    System.out.print("Organico");
                    n++;
                } else if (rGeneral > 70 && rGeneral < 75) {
                    System.out.print("Radioactivo");
                    n++;

                } else if (rGeneral > 75 && rGeneral < 100) {
                    System.out.print("Agua");
                    n++;
                }
            }
            if (n == planetasNeutrales) {
                bandera = false;
            }

        }

        //rellenarCampo();
    }

//  public void rellenarCampo() {
    //      Tierra tierra = new Tierra();
//
    //      for (int i = 0; i < filas; i++) {
    //        for (int j = 0; j < columnas; j++) {
    //          if (matriz[i][j] instanceof Tierra) {
    //            System.out.print("     " + matriz[i][j].getTierra() + "       ");
    //      } else if (matriz[i][j] instanceof Fuego) {
    //        System.out.print("     " + matriz[i][j].getFuego() + "       ");
    //  } else if (matriz[i][j] instanceof Organico) {
    //System.out.print("     " + matriz[i][j].getOrganico() + "       ");
    //} else if (matriz[i][j] instanceof Radioactivo) {
    //  System.out.print("     " + matriz[i][j].getRadioactivo() + "       ");
    // } else if (matriz[i][j] instanceof Agua) {
    //   System.out.print("     " + matriz[i][j].getAgua() + "       ");
    //} else {
    //  System.out.print("   " + "CORONAVIRUS" + "     ");
    //}
    //}
    //System.out.println("\n");
    //}
    //}
}
