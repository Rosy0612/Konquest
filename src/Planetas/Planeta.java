
package Planetas;

import Jugadores.Jugador;

public abstract class Planeta {

    public String getTierra(){
        return "TIERRA";
    } 
    
    public String getFuego(){
        return "FUEGO";
    } 
    
    public String getOrganico(){
        return "ORGANICO";
    }
    public String getRadioactivo(){
        return "RADIO";
    }
    public String getAgua(){
        return "AGUA";
    }
//    protected final char cuadroAgua = (char)61;
//    protected final char cuadroCampo = (char)35;
//    protected final char cuadroCerro = (char)77;
//    protected static final String Verde = "\033[32m";
//    protected static final String Azul = "\033[34m";
//    protected static final String Rojo = "\033[31m";
//
//    /*
//    Metodos para obtener los datos de todas las clases de donde se hara herencia
//    por medio de los cuales vamos a llenar los espacios en la matriz
//    */
//    String getSuperior(){
//        return getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+" ";
//    }
//
//    String getUsuarioAvion(){
//        Jugador jugador = new Jugador();
//        return jugador.get()+" ";
//    }
//
//    String getUsuarioTanque(){
//        Jugador jugador = new Jugador();
//        return jugador.getTanque()+" ";
//    }
//
//    String getEnemigo(){
//        return getCuadroColor()+" ";
//    }
//
//    String getInferior(){
//        return getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+" ";
//    }
//
//    abstract String getCuadroColor();
//    
}
