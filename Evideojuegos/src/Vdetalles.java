public class Vdetalles extends Vtipo{
    String tipo;
    double tiempoE;

    public Vdetalles(String clasificacion, String nombre,String tipo,double tiempoE) {
        super(clasificacion, nombre);
        setTipo(tipo);
        setTiempoE(tiempoE);
    }
    public void imprimirV() {
        super.imprimirV();
        System.out.println("Tipo  : "+getTipo()+" Tiempo estimado de paso nivel:  "+getTiempoE());
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTiempoE() {
        return tiempoE;
    }

    public void setTiempoE(double tiempoE) {
        this.tiempoE = tiempoE;
    }
}
