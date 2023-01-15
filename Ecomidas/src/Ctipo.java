package Ecomidas.src;

public class Ctipo {
    String tipoca;
    String regio;

    public Ctipo(String regio,String tipoca ) {
        this.tipoca = tipoca;
        this.regio = regio;
    }
    public void imprimir() {
        System.out.println("Region : "+getRegio()+" Tipo de carne:  "+getTipoca());
    }
    public String getTipoca() {
        return tipoca;
    }

    public void setTipoca(String tipoca) {
        this.tipoca = tipoca;
    }

    public String getRegio() {
        return regio;
    }

    public void setRegio(String regio) {
        this.regio = regio;
    }
}
