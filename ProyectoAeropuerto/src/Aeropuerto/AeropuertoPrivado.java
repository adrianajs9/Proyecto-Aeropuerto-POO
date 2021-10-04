/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aeropuerto;

/**
 *
 * @author adria
 */
public class AeropuertoPrivado extends Aeropuerto{
    private String listaEmpresas[] = new String[10];
    private int numEmpresa;

    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPrivado(String nombre, String ciudad, String pais, Compania[] c, String e[]) {
        super(nombre, ciudad, pais, c);
        this.listaEmpresas = e;
        numEmpresa = e.length;
    }
    
    public void insertarEmpresas(String e[]){
        this.listaEmpresas = e;
        this.numEmpresa = e.length;
    }
    
    public void insertarEmpresa(String e){
        listaEmpresas[numEmpresa] = e;
        numEmpresa++;
    }

    public String[] getListaEmpresas() {
        return listaEmpresas;
    }

    public int getNumEmpresa() {
        return numEmpresa;
    }
    
    
    
    
}
