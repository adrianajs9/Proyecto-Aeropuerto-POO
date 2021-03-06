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
public class Aeropuerto {
    private String nombre;
    private String ciudad;
    private String pais;
    private Compania listaCompania[] = new Compania[10];
    private int numCompania;

    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numCompania = 0;
    }
    
    public Aeropuerto(String nombre, String ciudad, String pais, Compania c[]) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        listaCompania = c;
        this.numCompania = c.length;
    }
    
    public void insertarCompania(Compania compania){
        listaCompania[numCompania] = compania;
        numCompania++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }
    

    public Compania[] getListaCompania() {
        return listaCompania;
    }

    public int getNumCompania() {
        return numCompania;
    }
    
    public Compania getCompania(int i){
        return listaCompania[i];
    }
    
    public Compania getCompania(String nombre){
        boolean encontrado = false;
        int i=0;
        Compania c = null;
        while((!encontrado) && (i<listaCompania.length)){
            if(nombre.equals(listaCompania[i].getNombre())){
                encontrado = true;
                c = listaCompania[i];
            }
            i++;
        }
        return c;
    }
    
}
