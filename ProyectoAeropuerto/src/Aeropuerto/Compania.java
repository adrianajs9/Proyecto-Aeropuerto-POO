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
public class Compania {
    private String nombre;
    private Vuelo listaVuelos[] = new Vuelo[10];
    private int numVuelo=0;

    public Compania(String nombre) {
        this.nombre = nombre;
    }
    
    public Compania(String nombre, Vuelo v[]){
        this.nombre = nombre;
        listaVuelos = v;
        numVuelo = v.length;
    }
    
    public void insertarVuelo(Vuelo vuelo){
        listaVuelos[numVuelo] = vuelo;
        numVuelo++;
    }

    
    public String getNombre() {
        return nombre;
    }

    public int getNumVuelo() {
        return numVuelo;
    }
    
    public Vuelo getVuelo(int i){
        return listaVuelos[i];
    }
    
    public Vuelo getVuelo(String id){
        boolean encontrado = false;
        int i=0;
        Vuelo v = null;
        while((!encontrado) && (i<listaVuelos.length)){
            if(id.equals(listaVuelos[i].getIdentificadorVuelo())){
                encontrado = true;
                v = listaVuelos[i];
            }
            i++;
        }
        return v;
    }
}
