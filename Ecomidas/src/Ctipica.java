package Ecomidas.src;

public class Ctipica extends Cpais {
String indredinteP;
double precio;


    public Ctipica(String regio, String tipoca, String paisO, String nombreP, String ingredinteP, double precio) {
        super(regio, tipoca, paisO, nombreP);
        setIndredinteP(ingredinteP);
        setPrecio(precio);
    }
    public void imprimir() {
        super.imprimir();
        System.out.println("El ingrediente principal es: "+getIndredinteP()+" Precio  "+getPrecio());
    }

    public String getIndredinteP() {
        return indredinteP;
    }

    public void setIndredinteP(String indredinteP) {
        this.indredinteP = indredinteP;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
