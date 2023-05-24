package tareaFormCanciones;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        //Crea y muestra una lista que contiene los elementos del arreglo palos
        String[] palos = {"Corazones", "Diamantes", "Bastos", "Espadas"};
        List<String> lista = Arrays.asList(palos);

        System.out.printf("Elementos del arreglo desordenados: %s%n",lista);
        Collections.sort(lista);
        System.out.printf("Elementos ordenados: %s%n", lista);

        //ordena de forma descendente usando un comparador
        Collections.sort(lista, Collections.reverseOrder());
        System.out.printf("Elementos ordenados de forma descendente: %s%n", lista);




    }
}
