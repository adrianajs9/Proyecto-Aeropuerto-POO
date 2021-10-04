/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aeropuerto;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Main {
    static Scanner entrada = new Scanner(System.in);
    final static int numAeropuertos = 4;
    static Aeropuerto aeropuertos[] = new Aeropuerto[numAeropuertos];
    
    public static void main(String[] args) {
        
        //insertar datos de los Aeropuertos
    }
    
    public static void insertarDatosAeropuerto(Aeropuerto aero[]){
        aero[0] = new AeropuertoPublico(80000000,"Jorge Chavez","Lima","Peru");
        aero[0].insertarCompania(new Compania("AeroPeru"));
        aero[0].insertarCompania(new Compania("LATAM"));
        aero[0].getCompania("AeroPeru").insertarVuelo(new Vuelo("IB20", "Lima", "Mexico", 150.9, 150));
        aero[0].getCompania("AeroPeru").insertarVuelo(new Vuelo("IB21", "Lima", "Buenos Aires", 180.99, 120));
        aero[0].getCompania("LATAM").insertarVuelo(new Vuelo("FC12", "Lima", "Londres", 500.9, 180));
        aero[0].getCompania("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Adriana","JSAE656","Mexicana"));
        aero[0].getCompania("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Ivan","TYSQ9856","Mexicana"));
        aero[0].getCompania("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Joanna","TREWD565","Inglesa"));
        
        aero[1] = new AeropuertoPrivado("Benito Juarez","Ciudad de Mexico","Mexico");
        aero[1].insertarCompania(new Compania("AeroMexico"));
        aero[1].getCompania("AeroMexico").insertarVuelo(new Vuelo("AM02", "Ciudad de Mexico", "Guadalajara", 200.85, 120));
        aero[1].getCompania("AeroMexico").insertarVuelo(new Vuelo("AM03", "Ciudad de Mexico", "Alemania", 350.2, 180));
        aero[1].getCompania("AeroMexico").getVuelo("AM02").insertarPasajero(new Pasajero("Adriana","JSAE656","Mexicana"));
        aero[1].getCompania("AeroMexico").getVuelo("AM03").insertarPasajero(new Pasajero("Ivan","TYSQ9856","Mexicana"));
        
        aero[1] = new AeropuertoPublico(9785400,"Cuahutemoc","Merida","Mexico");
        aero[1].insertarCompania(new Compania("Volaris"));
        aero[1].getCompania("Volaris").insertarVuelo(new Vuelo("VO56", "Merida", "Guadalajara", 180.9, 100));
        aero[1].getCompania("Volaris").insertarVuelo(new Vuelo("VO57", "Merida", "Guatemala", 250.6, 80));
        aero[1].getCompania("Volaris").getVuelo("VO56").insertarPasajero(new Pasajero("Adriana","JSAE656","Mexicana"));
        aero[1].getCompania("Volaris").getVuelo("VO57").insertarPasajero(new Pasajero("Ivan","TYSQ9856","Mexicana"));
        
        aero[1] = new AeropuertoPrivado("Garten","Berlin","Alemania");
        aero[1].insertarCompania(new Compania("AeroBerlin"));
        aero[1].getCompania("AeroBerlin").insertarVuelo(new Vuelo("AB15", "Berlin", "Paris", 380.9, 150));
        aero[1].getCompania("AeroBerlin").insertarVuelo(new Vuelo("AB16", "Berlin", "China", 750.9, 120));
        aero[1].getCompania("AeroBerlin").getVuelo("AB15").insertarPasajero(new Pasajero("Adriana","JSAE656","Mexicana"));
        aero[1].getCompania("AeroBerlin").getVuelo("AB16").insertarPasajero(new Pasajero("Ivan","TYSQ9856","Mexicana"));
        
    }
}
