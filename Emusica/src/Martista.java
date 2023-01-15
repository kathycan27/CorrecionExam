public class Martista extends Mtipo{
    String nombreAoG;
    String idioma;

    public Martista(String tipo, String paisO,String nombreAoG,String idioma) {
        super(tipo, paisO);
        setNombreAoG(nombreAoG);
        setIdioma(idioma);
    }
    public void imprimirM() {
        super.imprimirM();
        System.out.println("Grupo o artista: "+getNombreAoG()+" Idioma de la canción:  "+getIdioma());
    }
    public String getNombreAoG() {
        return nombreAoG;
    }

    public void setNombreAoG(String nombreAoG) {
        this.nombreAoG = nombreAoG;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
