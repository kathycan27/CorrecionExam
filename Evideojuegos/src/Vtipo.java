public class Vtipo {
String clasificacion;
String nombre;

    public Vtipo(String clasificacion, String nombre) {
        this.clasificacion = clasificacion;
        this.nombre = nombre;
    }
    public void imprimirV() {
        System.out.println("Clasificacion : "+getClasificacion()+" Nombre::  "+getNombre());
    }
    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
