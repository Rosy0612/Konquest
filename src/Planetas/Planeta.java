
package Planetas;

import Jugadores.Jugador;

public abstract class Planeta {
    String nombre;
    double pMuerte;
    int cDinero;
    String conquistador;
    
    public Planeta (String nombre, double pMuerte, int cDinero, String conquistador){
    this.nombre = nombre;
    this.pMuerte = pMuerte;
    this.cDinero = cDinero;
    this.conquistador = conquistador;
}

    public String getConquistador() {
        return conquistador;
    }

    public void setConquistador(String conquistador) {
        this.conquistador = conquistador;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getpMuerte() {
        return pMuerte;
    }

    public void setpMuerte(double pMuerte) {
        this.pMuerte = pMuerte;
    }

    public int getcDinero() {
        return cDinero;
    }

    public void setcDinero(int cDinero) {
        this.cDinero = cDinero;
    }

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
        return "RADIOACTIVO";
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
