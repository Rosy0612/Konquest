
package Guerreros;

public class Guerrero {
    String nombre;
    double facMuerte;
    int espacios;
    String ataque;
    
    public void Guerrero(String nombre, double facMuerte, int espacios, String ataque){
        this.nombre = nombre; 
        this.facMuerte=facMuerte; 
        this.espacios=espacios;
        this.ataque=ataque;
    }

    public String getAtaque() {
        return  ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
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
