
package Planetas;


public class Tierra extends Planeta {
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    public Tierra ( String nombre, double pMuerte, int cDinero, String conquistador){
        super (nombre, pMuerte, cDinero, conquistador);
    }

    @Override
    public String getConquistador() {
        return ANSI_WHITE+"Due: "+conquistador+ANSI_RESET;
    }

    @Override
    public void setConquistador(String conquistador) {
        this.conquistador = conquistador;
    }

    @Override
    public String getNombre() {
        return ANSI_WHITE+nombre+ANSI_RESET;
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
    public String getTipo(){
        return "TIERRA";
    } 
    
}
