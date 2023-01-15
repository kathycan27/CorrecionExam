public class Mdetalles extends Martista {
    String nombreC;
    double tiempoD;

    public Mdetalles(String tipo, String paisO, String nombreAoG, String idioma, String nombreC,double tiempoD) {
        super(tipo, paisO, nombreAoG, idioma);
        setNombreC(nombreC);
        setTiempoD(tiempoD);
    }
    public void imprimirM() {
        super.imprimirM();
        System.out.println("Nombre: "+getNombreAoG()+" tiempo de duracion:  "+getIdioma());
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public double getTiempoD() {
        return tiempoD;
    }

    public void setTiempoD(double tiempoD) {
        this.tiempoD = tiempoD;
    }
}
