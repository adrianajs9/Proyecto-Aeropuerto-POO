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
        insertarDatosAeropuerto(aeropuertos);
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
        String empresas[] = {"Bancomer","Corona"};
        ((AeropuertoPrivado)aero[1]).insertarEmpresas(empresas);
        aero[1].getCompania("AeroMexico").insertarVuelo(new Vuelo("AM02", "Ciudad de Mexico", "Guadalajara", 200.85, 120));
        aero[1].getCompania("AeroMexico").insertarVuelo(new Vuelo("AM03", "Ciudad de Mexico", "Alemania", 350.2, 180));
        aero[1].getCompania("AeroMexico").getVuelo("AM02").insertarPasajero(new Pasajero("Adriana","JSAE656","Mexicana"));
        aero[1].getCompania("AeroMexico").getVuelo("AM03").insertarPasajero(new Pasajero("Ivan","TYSQ9856","Mexicana"));
        
        aero[2] = new AeropuertoPublico(9785400,"Cuahutemoc","Merida","Mexico");
        aero[2].insertarCompania(new Compania("Volaris"));
        aero[2].getCompania("Volaris").insertarVuelo(new Vuelo("VO56", "Merida", "Guadalajara", 180.9, 100));
        aero[2].getCompania("Volaris").insertarVuelo(new Vuelo("VO57", "Merida", "Guatemala", 250.6, 80));
        aero[2].getCompania("Volaris").getVuelo("VO56").insertarPasajero(new Pasajero("Adriana","JSAE656","Mexicana"));
        aero[2].getCompania("Volaris").getVuelo("VO57").insertarPasajero(new Pasajero("Ivan","TYSQ9856","Mexicana"));
        
        aero[1] = new AeropuertoPrivado("Garten","Berlin","Alemania");
        aero[1].insertarCompania(new Compania("AeroBerlin"));
        String empresas2[] = {"Modelo","Banorte"};
        ((AeropuertoPrivado)aero[1]).insertarEmpresas(empresas2);
        aero[1].getCompania("AeroBerlin").insertarVuelo(new Vuelo("AB15", "Berlin", "Paris", 380.9, 150));
        aero[1].getCompania("AeroBerlin").insertarVuelo(new Vuelo("AB16", "Berlin", "China", 750.9, 120));
        aero[1].getCompania("AeroBerlin").getVuelo("AB15").insertarPasajero(new Pasajero("Adriana","JSAE656","Mexicana"));
        aero[1].getCompania("AeroBerlin").getVuelo("AB16").insertarPasajero(new Pasajero("Ivan","TYSQ9856","Mexicana")); 
    }
    
    public static void menu(){
        int opcion;
        do {            
            System.out.println("\t.:Menu");
            System.out.println("1.Consultar los aeropuertos gestionados(Publicos, Privados)");
            System.out.println("2.Empresas (Aeropuerto privado) o subvencion (Aeropuerto publico)");
            System.out.println("3.Lista de compañias de un aeropuerto");
            System.out.println("4.Lista de vuelos por compañia");
            System.out.println("5.Listar vuelos con origen y destino");
            System.out.println("6.Salir");
            System.out.println("Seleccione un opcion");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1: 
                        break;
                case 2: 
                        break;
                case 3: 
                        break;
                case 4: 
                        break;
                case 5:
                        break;
                case 6: break;
                default: System.out.println("Opcion no valida");
                        break;
            }
        } while (opcion != 6);
    }
    
    public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]){
        for(int i=0;i<aeropuertos.length;i++){
            if(aeropuertos[i] instanceof AeropuertoPrivado){
                System.out.println("Aeropuerto Privado");
                System.out.println("Nombre: "+aeropuertos[i].getNombre());
                System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
                System.out.println("Pais: "+aeropuertos[i].getPais());
            }
        }
    }
}
