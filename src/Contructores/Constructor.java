
package Contructores;

public class Constructor {
    String nombre, tipoNave;
    int numTurno;
    double pCompra, pVenta;
    
    public Constructor(String nombre, String tipoNave, int numTurno, double pCompra, double pVenta){
        this.nombre=nombre; this.tipoNave=tipoNave; this.numTurno=numTurno;
        this.pCompra=pCompra; this.pVenta= pVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoNave() {
        return tipoNave;
    }

    public void setTipoNave(String tipoNave) {
        this.tipoNave = tipoNave;
    }

    public int getNumTurno() {
        return numTurno;
    }

    public void setNumTurno(int numTurno) {
        this.numTurno = numTurno;
    }

    public double getpCompra() {
        return pCompra;
    }

    public void setpCompra(double pCompra) {
        this.pCompra = pCompra;
    }

    public double getpVenta() {
        return pVenta;
    }

    public void setpVenta(double pVenta) {
        this.pVenta = pVenta;
    }
    
}
