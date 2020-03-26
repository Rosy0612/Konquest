
package Naves;

public class Nave {
    String nave;
    double velocidad;
    int espacios, produccion, pVenta; 

    public Nave(String nave, double velocidad, int espacios, int produccion, int pVenta){
        this.nave=nave;
        this.velocidad=velocidad;
        this.espacios=espacios;
        this.produccion=produccion;
        this.pVenta=pVenta; 
    }

    public String getNave() {
        return nave;
    }

    public void setNave(String nave) {
        this.nave = nave;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getpVenta() {
        return pVenta;
    }

    public void setpVenta(int pVenta) {
        this.pVenta = pVenta;
    }

    public int getEspacios() {
        return espacios;
    }

    public void setEspacios(int espacios) {
        this.espacios = espacios;
    }

    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }
    
}
