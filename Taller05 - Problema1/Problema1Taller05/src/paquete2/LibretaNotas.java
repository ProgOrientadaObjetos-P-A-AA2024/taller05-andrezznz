package paquete2;

public class LibretaNotas {

    private String nombreEstudiante;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
    
    public LibretaNotas(String n, double c1, double c2, double c3) {
        
        nombreEstudiante = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
        
    }
    
    public LibretaNotas(String n, double c1, double c2) {
        
        nombreEstudiante = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = (c1 + c2) / 2;
        
    }
    
    public void establecerNombreEstudiante(String x) {
        nombreEstudiante = x;
    }
    
    public void establecerCalificacion1(double a) {
        calificacion1 = a;
    }
    
    public void establecerCalificacion2(double a) {
        calificacion2 = a;
    }
    
    public void establecerCalificacion3(double a) {
        calificacion3 = a;
    }
    
    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) /3;
    }
    
    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }
    
    public double obtenerCalificacion1() {
        return calificacion1;
    }
    
    public double obtenerCalificacion2() {
        return calificacion2;
    }
    
    public double obtenerCalificacion3() {
        return calificacion3;
    }
    
    public double obtenerPromedio() {
        return promedio;
    }    
    
    @Override
    public String toString() {
        
        String cadena = String.format("\n\nLibreta de Calificaciones\n\n"
                + "Nombre del Estudiante: %s\n"
                + "Calificacion 1: %.3f\n"
                + "Calificacion 2: %.3f\n"
                + "Calificacion 3: %.3f\n\n"
                + "Promedio Del Estudiante: %.2f\n\n"
        , obtenerNombreEstudiante(), obtenerCalificacion1()
        , obtenerCalificacion2(), obtenerCalificacion3(), obtenerPromedio());
        
        return cadena;
    } 
    
}
