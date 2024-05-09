package paquete1;

import paquete2.MatriculaVehiculos;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int anio, i = 0, numVehiculos;
        String cadenaFinal, cedula, marca;
        double valor;

        cadenaFinal = "";

        System.out.print(" Numero de Vehiculos a Evauluar:  ");
        numVehiculos = leer.nextInt();

        while (i < numVehiculos) {
            
            leer.nextLine();

            System.out.print("\nNumero De Cedula:            ");
            cedula = leer.nextLine();
            System.out.print(" Marca Del Vehiculo:          ");
            marca = leer.nextLine();
            System.out.print(" Anio Del Fabricante:         ");
            anio = leer.nextInt();
            System.out.print(" Valor Del Vehiculo:          ");
            valor = leer.nextInt();

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
            
            i++;
        }
        System.out.printf("%s\n", cadenaFinal);
    }
}
