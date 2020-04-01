
package Contructores;

public class Obrero extends Constructor {
    public Obrero(){
        super ("Obrero","Naboo N-1", 3, 50, 40);
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
