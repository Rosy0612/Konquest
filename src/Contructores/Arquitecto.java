
package Contructores;

public class Arquitecto extends Constructor {
    public Arquitecto(){
    super("Arquitecto", "Millenial Falcon", 1,250,175);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getTipoNave() {
        return tipoNave;
    }

    @Override
    public void setTipoNave(String tipoNave) {
        this.tipoNave = tipoNave;
    }

    @Override
    public int getNumTurno() {
        return numTurno;
    }

    @Override
    public void setNumTurno(int numTurno) {
        this.numTurno = numTurno;
    }

    @Override
    public double getpCompra() {
        return pCompra;
    }

    @Override
    public void setpCompra(double pCompra) {
        this.pCompra = pCompra;
    }

    @Override
    public double getpVenta() {
        return pVenta;
    }

    @Override
    public void setpVenta(double pVenta) {
        this.pVenta = pVenta;
    }
    
}
