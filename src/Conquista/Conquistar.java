
package Conquista;

import java.util.Scanner;


public class Conquistar {
    Scanner leer = new Scanner (System.in);
    String moverseAplaneta;
    int cNaves;
    String tNaves;
    int cGuerreros;
    String tGuerreros;
    public Conquistar(){
        System.out.println("El juego ha iniciado \n"+
        "Ingrese el nombre del planeta al que desea moverse\n");
        moverseAplaneta = leer.nextLine();
        System.out.println("Ingrese la cantidad de naves que enviara");
        cNaves = leer.nextInt();
        System.out.println("Ingrese el tipo de nave que enviara");
        tNaves = leer.nextLine();
        System.out.println("Ingrese la cantidad de guerrerros que enviara");
        cGuerreros = leer.nextInt();
        System.out.println("Ingrese el tipo de guerreros que enviara");
        tGuerreros = leer.nextLine();
    }
    
    
}
