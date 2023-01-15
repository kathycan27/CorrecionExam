public class Vequipo extends Vdetalles{
    String equipoJ;
    int numeroC;

    public Vequipo(String clasificacion, String nombre, String tipo, double tiempoE, String equipoJ, int numeroC) {
        super(clasificacion, nombre, tipo, tiempoE);
        setEquipoJ(equipoJ);
        setNumeroC(numeroC);
    }
    public void imprimirV() {
        System.out.println("Equipos donde se puede jugar : "+getEquipoJ()+" Numero de capitulos:  "+getNumeroC());
    }
    public String getEquipoJ() {
        return equipoJ;
    }

    public void setEquipoJ(String equipoJ) {
        this.equipoJ = equipoJ;
    }

    public int getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(int numeroC) {
        this.numeroC = numeroC;
    }
}
