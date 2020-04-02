
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

    /**
     *
     * @return
     */
    public abstract String getTipo();
    
      
}

