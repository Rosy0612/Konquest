
package Naves;

public class MillenialFalcon extends Nave {
    public MillenialFalcon(){
        super("Milenial Falcon", 1.50,58,70,20);
    }

    /**
     *
     * @return
     */
    @Override
    public String getNave() {
        return nave;
    }

    @Override
    public void setNave(String nave) {
        this.nave = nave;
    }

    @Override
    public double getVelocidad() {
        return velocidad;
    }

    @Override
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public int getEspacios() {
        return espacios;
    }

    @Override
    public void setEspacios(int espacios) {
        this.espacios = espacios;
    }

    @Override
    public int getProduccion() {
        return produccion;
    }

    @Override
    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }

    @Override
    public int getpVenta() {
        return pVenta;
    }

    @Override
    public void setpVenta(int pVenta) {
        this.pVenta = pVenta;
    }
    
    
}
