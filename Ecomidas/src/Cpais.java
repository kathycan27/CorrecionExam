package Ecomidas.src;

public class Cpais extends Ctipo {
    String paisO;
    String nombreP;

    public Cpais(String regio, String tipoca, String paisO, String nombreP) {
        super(regio, tipoca);
        setPaisO(paisO);
        setNombreP(nombreP);

    }
    public void imprimir() {
        super.imprimir();
        System.out.println("Pais de origen : "+getPaisO()+" Nombre plato:  "+getNombreP());
    }

    public String getPaisO() {
        return paisO;
    }

    public void setPaisO(String paisO) {
        this.paisO = paisO;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }
}
