import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String clasificacion;
        String nombre;
        Scanner sc= new Scanner(System.in);
        List listavideojuegos=new ArrayList<>();
        listavideojuegos.add(new Vtipo("mayores de 18","Good of Wars"));
        listavideojuegos.add(new Vdetalles("mayores de 18 ","League of Leguent","multijugador",40.2));
        listavideojuegos.add(new Vequipo("mayores a 15 años ","Super Mario","multijugador",30,"nindendo switch",60 ));
        imprimirLista((ArrayList)listavideojuegos);


    }
    private static void imprimirLista (ArrayList listavideojuegos)
    {
        for(int i = 0; i< listavideojuegos.size(); i++)
        {
            Vtipo v=(Vtipo) listavideojuegos.get(i);
            v.imprimirV();
            System.out.println(" ");
        }
    }
}