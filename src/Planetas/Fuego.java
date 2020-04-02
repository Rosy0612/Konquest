
package Planetas;

public class Fuego extends Planeta {
    
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_RESET = "\u001B[0m";
   
    public Fuego( String nombre, double pMuerte, int cDinero, String conquistador ){
        super (nombre, pMuerte, cDinero, conquistador);
       
    }

    @Override
    public String getConquistador() {
        return ANSI_RED+"Due: "+conquistador+ANSI_RESET;
    }

    @Override
    public void setConquistador(String conquistador) {
        this.conquistador = conquistador;
    }

    @Override
    public String getNombre() {
        return ANSI_RED+"Nom: "+nombre+ANSI_RESET;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double getpMuerte() {
        return pMuerte;
    }

    @Override
    public void setpMuerte(double pMuerte) {
        this.pMuerte = pMuerte;
    }

    @Override
    public int getcDinero() {
        return cDinero;
    }

    @Override
    public void setcDinero(int cDinero) {
        this.cDinero = cDinero;
    }
    
    
    @Override
    public String getTipo() {
        return "Fuego";
    }
    
}