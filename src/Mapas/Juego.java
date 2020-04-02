package Mapas;

import Planetas.Planeta;
import java.util.Scanner;

public class Juego {

    Scanner leer;
    Planeta[][] matriz;

    public Juego(Planeta[][] matriz) {
        this.matriz = matriz;
    }
    
    

    public void menu2() {
        leer = new Scanner(System.in);
        System.out.println("\n Los jugadores pueden realizar las sigueintes acciones: \n"
                + "1) Medir una distancias \n"
                + "2) Ver un planeta \n"
                + "3) Consultar flota \n"
                + "4) Enviar flota \n"
                + "5) Construir una nave \n"
                + "6) Ir a tienda \n"
                + "7) Batalla \n");
        System.out.println("Escriba el numero de la opcion que desee");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                medirDistancia();
                break;
            case 2:
                verPlaneta();
                break;
            case 3:
                System.out.println("No programado");
                menu2();
                break;
            case 4:
                System.out.println("No programado");
                menu2();
                break;
            case 5:
                System.out.println("No programado");
                menu2();
                break;
            case 6:
                System.out.println("No programado");
                menu2();
                break;
            case 7:
                System.out.println("No programado");
                menu2();
                break;
            default:
                System.out.println("No es una de las opciones, por favor elija de nuevo");
                break;
        }
    }

    public void medirDistancia() {
        leer = new Scanner(System.in);
        System.out.println("\nLa distancia entre planetas se mide en años luz, \n"
                + "para esto ingrese la ubicacion del planeta origen y la ubicación del planeta de destino, separadas por coma "
                + "Ejemplo: 1,2. Indicando primero la fila y despues la columna ");
        
        String Ubicacion = leer.nextLine();
        String[] UbSeparada = Ubicacion.split(",");
        
        
        menu2();
    }

    public void verPlaneta() {
        leer = new Scanner(System.in);
        System.out.println("\nUd solo puede ver sus planetas y los planetas neutrales, para ver uno por favor escriba la ubicacion del planeta separadas por coma\n"
                + "Ejemplo: 1,2. Indicando primero la fila y despues la columna \nPor favor ingrese la ubicacion: ");
        
        String Ubicacion = leer.nextLine();
        String[] UbSeparada = Ubicacion.split(",");
        
        System.out.print("\nEl dueño es: ");
        System.out.println(matriz[Integer.parseInt(UbSeparada[0])][Integer.parseInt(UbSeparada[1])].getConquistador());
        System.out.print("La cantidad de dinero es: ");
        System.out.println(matriz[Integer.parseInt(UbSeparada[0])][Integer.parseInt(UbSeparada[1])].getcDinero());
        System.out.print("El tipo de planeta es: ");
        System.out.println(matriz[Integer.parseInt(UbSeparada[0])][Integer.parseInt(UbSeparada[1])].getTipo());
        menu2();
    }

}
