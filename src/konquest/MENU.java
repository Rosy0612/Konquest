package konquest;

import Mapas.DisenioMapas;

import java.util.Scanner;

public class MENU {

    //declaracion de nuevos scanner
    Scanner leer = new Scanner(System.in);                                                                                          
    Scanner imprimir = new Scanner(System.in);

    public void MENU() {                                                                                                            //inicio metodo MENU

        int respuesta;                                                                                                              //variable de tipo entero

        System.out.println("BIENVENIDO A JUEGOS GYF \n"                                                                             //mostrar el texto
                + "Le presentamos nuestro nuevo juego llamado: Konquest, que consiste en lo siguiente: \n"
                + "Dos jugadores pueden conquistar planetas, enviando naves con guerreros, \n"
                + "para poder construir un gran imperio al conquistar todos los planetas  disponibles.\n"
                + "elija un numero de opcion ");
        System.out.println("1. Iniciar juego \n"                                                                                    //mostrar las opciones de inicio
                + "2. Salir del sistema ");
        respuesta = leer.nextInt();                                                                                                 //guardar la opcion de inicio en una variable
        if (respuesta == 1) {                                                                                                       //si la opcion es 1 entonces 
            MenuInicio();                                                                                                           //llamara al metodo MenuInicio
        } else if (respuesta == 2) {                                                                                                //si la ocpcion es 2, entonces                                                                                          
            System.exit(respuesta);                                                                                                 //detener el programa
        }else if (respuesta != 1 && respuesta !=2){                                                                                 // si la opcion es diferente de 1 y 2 entonces
            System.out.println("la opcion no existe");                                                                              //mostrar texto
            MENU();                                                                                                                 //llamara al metodo MENU
        }

    }

    public void MenuInicio() {
        int filas, columnas, planetasNeutrales;
        String Jugador1, Jugador2;
        DisenioMapas M1 = new DisenioMapas();

        System.out.println("ingrese el numero de filas para el mapa ");
        filas = leer.nextInt();
        System.out.println("ingrese el numero de columnas para el mapa");
        columnas = leer.nextInt();
        System.out.println("ingrese la cantidad de planetas neutrales para el mapa");
        planetasNeutrales = leer.nextInt();
        System.out.println("ingrese el nombre del Jugador numero 1");
        Jugador1 = imprimir.nextLine();
        System.out.println("ingrese el nombre del Jugador numero 2");
        Jugador2 = imprimir.nextLine();
        System.out.println("Diseño del mapa:\n1) Aleatorio\n2) Manual");
        int opcionMapa = leer.nextInt();

        switch (opcionMapa) {
            case 1:
                M1.MapaAleatorio(filas, columnas, planetasNeutrales, Jugador1, Jugador2);
                break;
            case 2:
                M1.MapaManual(filas, columnas, planetasNeutrales, Jugador1, Jugador2);
                break;
            default:
                System.out.println("La opcion no existe, elija una de las opciones");
        }
    }

}
