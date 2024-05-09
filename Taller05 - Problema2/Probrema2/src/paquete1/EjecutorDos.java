package paquete1;

import paquete2.MatriculaVehiculos;
import java.util.Scanner;

public class EjecutorDos {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        String cedula, marca, opcion, cadenaFinal;
        
        int anio;
        double valor;
        
        cadenaFinal = "";

        boolean bandera = true;

        while (bandera) {

            System.out.print("\nNumero De Cedula:           ");
            cedula = leer.nextLine();
            System.out.print(" Marca Del Vehiculo:          ");
            marca = leer.nextLine();
            System.out.print(" Anio Del Fabricante:         ");
            anio = leer.nextInt();
            System.out.print(" Valor Del Vehiculo:          ");
            valor = leer.nextDouble();

            MatriculaVehiculos autos = new MatriculaVehiculos(cedula, marca,
                    anio, valor);
            
            autos.calcularAntiguedad();
            autos.calcularValorMatricula();

            cadenaFinal = String.format("%s\nVALOR DE LA MATRICULA\n\n"
                    + "Cedula: %s\n"
                    + "Marca Del Vehiculo: %s\n"
                    + "Anio De Fabricacion: %d\n"
                    + "Valor Del Vehiculo: %.3f\n", cadenaFinal,
                    autos.obtenerCedula(), autos.obtenerMarcaVehiculo(),
                    autos.obtenerAnioFabricacion(), autos.obtenerValorVehiculo(),
                    autos.obtenerAntiguedad(), autos.obtenerValorMatricula());

            leer.nextLine();
            
            System.out.println("Desea ingresar más vendedores. Ingrese n para"
                    + " salir");
            opcion = leer.nextLine();
            if (opcion.equals("n")) {
                bandera = false;
            }
        }
        System.out.printf("%s", cadenaFinal);
    }   
}
