/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Planetas;

public class Radioactivo extends Planeta{
    public Radioactivo ( String nombre, double pMuerte, int cDinero, String conquistador){
        super (nombre, pMuerte, cDinero, conquistador);
    }

    @Override
    public String getConquistador() {
        return conquistador;
    }

    @Override
    public void setConquistador(String conquistador) {
        this.conquistador = conquistador;
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
    
}
