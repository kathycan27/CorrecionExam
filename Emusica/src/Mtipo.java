public class Mtipo {
    String tipo;
    String paisO;

    public Mtipo(String tipo, String paisO) {
        this.tipo = tipo;
        this.paisO = paisO;
    }
    public void imprimirM() {
        System.out.println("Tipo de musica : "+getTipo()+" Pais de origen:  "+getPaisO());
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPaisO() {
        return paisO;
    }

    public void setPaisO(String paisO) {
        this.paisO = paisO;
    }
}
