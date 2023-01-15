import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String clasificacion;
        String nombre;
        Scanner sc = new Scanner(System.in);
        List listamusica = new ArrayList<>();
        listamusica.add(new Mtipo("Kpop", "Korea"));
        listamusica.add(new Martista("Bachata ", "Colombia", "Juan Luis Guerra", "Español"));
        listamusica.add(new Mdetalles("Bachata ", "Colombia", "Romeo Santos", "Español","Solo conmigo",4.16));
        imprimirLista((ArrayList) listamusica);


    }

    private static void imprimirLista(ArrayList litamusica) {
        for (int i = 0; i < litamusica.size(); i++) {
            Mtipo m = (Mtipo) litamusica.get(i);
            m.imprimirM();
            System.out.println(" ");
        }
    }
}