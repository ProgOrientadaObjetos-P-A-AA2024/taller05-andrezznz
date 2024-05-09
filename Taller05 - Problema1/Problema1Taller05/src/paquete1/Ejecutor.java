package paquete1;

import java.util.Scanner;
import paquete2.LibretaNotas;

public class Ejecutor {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int opcion;
        String name;
        double nota1, nota2, nota3;
        boolean bandera = true;

        while (bandera) {
            System.out.println("---------------------- M E N U ----------------------");
            System.out.println("Ingresar DOS Calificaciones Del Estudiante  [1]");
            System.out.println("Ingresar TRES Calificaciones Del Estudainte [2]");
            System.out.println("S A L I R [3]");
            System.out.println("-----------------------------------------------------");

            opcion = leer.nextInt();

            if (opcion == 1) {

                System.out.print(" Ingrese nombre del estudiante:       ");
                name = leer.next();
                System.out.print(" Ingrese La Calificacion Numero 1:    ");
                nota1 = leer.nextDouble();
                System.out.print(" Ingrese La Calificacion Numero 2:    ");
                nota2 = leer.nextDouble();

                LibretaNotas estudiante = new LibretaNotas(name, nota1, nota2);

                estudiante.calcularPromedio();

                System.out.printf("%s\n", estudiante);

            } else {
                if (opcion == 2) {

                    System.out.print(" Ingrese nombre del estudiante:       ");
                    name = leer.next();
                    System.out.print(" Ingrese La Calificacion Numero 1:    ");
                    nota1 = leer.nextDouble();
                    System.out.print(" Ingrese La Calificacion Numero 2:    ");
                    nota2 = leer.nextDouble();
                    System.out.print(" Ingrese la Calificacion Numero 3:    ");
                    nota3 = leer.nextInt();

                    LibretaNotas estudiante = new LibretaNotas(name, nota1,
                            nota2, nota3);

                    estudiante.calcularPromedio();

                    System.out.printf("%s\n", estudiante);

                } else {
                    if (opcion == 3) {
                        System.out.println(" SALIENDO DEL SISTEMA...");
                        bandera = false;
                    }
                }
            }
            leer.nextLine(); // Limpieza del buffer
        }

    }
    
}
