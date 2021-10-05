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
        
        //menu
        menu();
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
        
        aero[3] = new AeropuertoPrivado("Garten","Berlin","Alemania");
        aero[3].insertarCompania(new Compania("AeroBerlin"));
        String empresas2[] = {"Modelo","Banorte"};
        ((AeropuertoPrivado)aero[3]).insertarEmpresas(empresas2);
        aero[3].getCompania("AeroBerlin").insertarVuelo(new Vuelo("AB15", "Berlin", "Paris", 380.9, 150));
        aero[3].getCompania("AeroBerlin").insertarVuelo(new Vuelo("AB16", "Berlin", "China", 750.9, 120));
        aero[3].getCompania("AeroBerlin").getVuelo("AB15").insertarPasajero(new Pasajero("Adriana","JSAE656","Mexicana"));
        aero[3].getCompania("AeroBerlin").getVuelo("AB16").insertarPasajero(new Pasajero("Ivan","TYSQ9856","Mexicana")); 
    }
    
    public static void menu(){
        String nombreAeropuerto, nombrecompania, ciudadOrigen, ciudadDestino;
        int opcion;
        Aeropuerto aeropuerto;
        Compania compania;
        Vuelo vuelo;
      
        
        do {            
            System.out.println("\t.:Menu");
            System.out.println("1.Consultar los aeropuertos gestionados(Publicos, Privados)");
            System.out.println("2.Empresas (Aeropuerto privado) o subvencion (Aeropuerto publico)");
            System.out.println("3.Lista de compañias de un aeropuerto");
            System.out.println("4.Lista de vuelos por compañia");
            System.out.println("5.Listar vuelos con origen y destino");
            System.out.println("6.Salir");
            System.out.print("Seleccione un opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1: System.out.println("");
                        mostrarDatosAeropuertos(aeropuertos);
                        break;
                case 2: System.out.println("");
                        mostrarPatrocinio(aeropuertos);
                        break;
                case 3: entrada.nextLine();
                        System.out.print("De que aeropuerto quieres conocer la lista de compañias? ");
                        nombreAeropuerto = entrada.nextLine();
                        aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
                        if (aeropuerto == null) {
                            System.out.println("El aeropuerto no existe");
                        } else {
                            mostrarCompanias(aeropuerto);
                        }
                        break;
                case 4: entrada.nextLine();
                        System.out.print("Selecciona un aeropuerto: ");
                        nombreAeropuerto = entrada.nextLine();
                        aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
                        if (aeropuerto == null) {
                            System.out.println("El aeropuerto no existe");
                        } else {
                            System.out.print("Digite el nombre de la compañia: ");
                            nombrecompania = entrada.nextLine();
                            compania = aeropuerto.getCompania(nombrecompania);
                            System.out.println("La compañia no existe");
                            mostrarVuelos(compania);
                        }
                        break;
                case 5: entrada.nextLine();
                        System.out.print("Digita la ciudad de origen: ");
                        ciudadOrigen = entrada.nextLine();
                        System.out.print("Digita la ciudad destino: ");
                        ciudadDestino = entrada.nextLine();
                        mostrarVueloOrigenDestino(ciudadOrigen, ciudadDestino, aeropuertos);
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
            } else {
                System.out.println("Aeropuerto Publico");
                System.out.println("Nombre: "+aeropuertos[i].getNombre());
                System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
                System.out.println("Pais: "+aeropuertos[i].getPais());
            }
            System.out.println("");
        }
    }
    
    public static void mostrarPatrocinio(Aeropuerto aeropuertos[]){
        String empresas[];
        for(int i=0;i<aeropuertos.length;i++){
            if(aeropuertos[i] instanceof AeropuertoPrivado){
                System.out.println("Aeropuerto Privado: "+aeropuertos[i].getNombre());
                empresas = ((AeropuertoPrivado)aeropuertos[i]).getListaEmpresas();
                System.out.println("Empresas: ");
                for(int j=0;j<empresas.length;j++){
                    System.out.println(empresas[j]);
                }
            } else {
                System.out.println("Aeropuerto Publico: "+aeropuertos[i].getNombre());
                System.out.println("Subvencion: "+((AeropuertoPublico)aeropuertos[i]).getSubvencion());
            }
            System.out.println("");
        }
    }
    
    public static Aeropuerto buscarAeropuerto(String nombre, Aeropuerto aeropuertos[]){
        boolean encontrado = false;
        int i=0;
        Aeropuerto aero = null;
        while ((!encontrado) && (i<aeropuertos.length)) {            
            if (nombre.equals(aeropuertos[i].getNombre())) {
                encontrado = true;
                aero = aeropuertos[i];
            }
            i++;
        }
        return aero;
    }
    
    public static void mostrarCompanias(Aeropuerto aeropuerto){
        System.out.println("");
        System.out.println("Las compañias del aeropuerto "+aeropuerto.getNombre()+" son:");
        for (int i = 0; i < aeropuerto.getNumCompania(); i++) {
            System.out.println(aeropuerto.getCompania(i).getNombre());
        }
    }
    
    
    public static void mostrarVuelos(Compania compania){
        Vuelo vuelo;
        System.out.println("");
        System.out.println("Los vuelos de la compañia "+compania.getNombre()+" son:");
        for (int i = 0; i < compania.getNumVuelo(); i++) {
            vuelo = compania.getVuelo(i);
            System.out.println("Identificador de vuelo: "+vuelo.getIdentificadorVuelo());
            System.out.println("Ciudad de origen: "+vuelo.getCiudadOrigen());
            System.out.println("Ciudad de destino: "+vuelo.getCiudadDestino());
            System.out.println("Precio: "+vuelo.getPrecio());
            System.out.println("");
        }
    }
    
    public static Vuelo[] buscarVuelo(String origen, String destino, Aeropuerto aeropuertos[]){
        Vuelo vuelo;
        int contador=0;
        Vuelo listaVuelos[];
        for (int i = 0; i < aeropuertos.length; i++) {
            for (int j = 0; j < aeropuertos[i].getNumCompania(); j++) {
                for (int k = 0; k < aeropuertos[i].getCompania(j).getNumVuelo(); k++) {
                    vuelo = aeropuertos[i].getCompania(j).getVuelo(k);
                    if ((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCiudadDestino()))) {
                       contador++; 
                    }
                }
            }
        }
        listaVuelos = new Vuelo[contador];
        int q=0;
        for (int i = 0; i < aeropuertos.length; i++) {
           for (int j = 0; j < aeropuertos[i].getNumCompania(); j++) {
                for (int k = 0; k < aeropuertos[i].getCompania(j).getNumVuelo(); k++) {
                    vuelo = aeropuertos[i].getCompania(j).getVuelo(k);
                    if ((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCiudadDestino()))) {
                       listaVuelos[q] = vuelo;
                       q++;
                    }
                }
            } 
        }
        return listaVuelos;
    }
    
    public static void mostrarVueloOrigenDestino(String origen, String destino, Aeropuerto aeropuertos[]){
        Vuelo vuelos[];
        vuelos = buscarVuelo(origen, destino, aeropuertos);
        if (vuelos.length==0) {
            System.out.println("No existen vuelos de esa ciudad de origen a ese destino");
        } else{
            System.out.println("\nVuelos encontrados: ");
            for (int i = 0; i < vuelos.length; i++) {
                System.out.println("Identificador: "+vuelos[i].getIdentificadorVuelo());
                System.out.println("Ciudad origen: "+vuelos[i].getCiudadOrigen());
                System.out.println("Ciudad destino: "+vuelos[i].getCiudadDestino());
                System.out.println("Precio: "+vuelos[i].getPrecio());
                System.out.println("");
            }
        }
    }
}
