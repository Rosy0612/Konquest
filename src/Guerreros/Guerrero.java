
package Guerreros;

public class Guerrero {
    String nombre;
    double facMuerte;
    int espacios;
    
    public void Guerrero(String nombre, double facMuerte, int espacios){
        this.nombre = nombre; this.facMuerte=facMuerte; this.espacios=espacios;       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getFacMuerte() {
        return facMuerte;
    }

    public void setFacMuerte(double facMuerte) {
        this.facMuerte = facMuerte;
    }

    public int getEspacios() {
        return espacios;
    }

    public void setEspacios(int espacios) {
        this.espacios = espacios;
    }
    
    
}
