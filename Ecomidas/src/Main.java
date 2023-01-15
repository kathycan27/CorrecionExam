package Ecomidas.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String regio;
        String tipoca;

        Scanner sc = new Scanner(System.in);
        List listacomida = new ArrayList();
        List listacomida1 = listacomida;
        listacomida1.add(new Ctipo("America", "mariscos "));
        listacomida1.add(new Cpais("Europa", "mariscos", "España ", "paella"));
        listacomida1.add(new Ctipica("America", "Res ", " Mexico", "tacos", "tortillas_maiz", 3));
        imprimirLista((ArrayList) listacomida1);
    }
        private static void imprimirLista (ArrayList listacomida1)
        {
            for(int i = 0; i< listacomida1.size(); i++)
            {
                Ctipo c=(Ctipo) listacomida1.get(i);
                c.imprimir();
                System.out.println(" ");
            }
        }

}