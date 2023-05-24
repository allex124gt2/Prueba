package tareaFormCanciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main3 {

    public static void main(String[] args) {
        List<persona> ListaPersonas = new ArrayList<>();
        {
            ListaPersonas.add(new persona("Pedro", "Picapiedra", 40));
            ListaPersonas.add(new persona("Pablo", "Mármol", 38));
            ListaPersonas.add(new persona("Vilma", "De picapiedra", 35));
            ListaPersonas.add(new persona("Betty", "Mármol", 35));
            ListaPersonas.add(new persona("Tony", "Stark", 50));
            ListaPersonas.add(new persona("Bella", "Stark", 56));
            ListaPersonas.add(new persona("Bella", "Stark", 12));



            System.out.println("Elementos desordenados: ");
            ListaPersonas.forEach(persona -> System.out.println(persona));
            System.out.println();


            Collections.sort(ListaPersonas, new ComparadorEdad());
            System.out.println("Elementos de la lista ordenados por edad:");
            ListaPersonas.forEach(persona -> System.out.println(persona));
            System.out.println();


            Collections.sort(ListaPersonas, new CompNombre());
            System.out.println("Elementos de la lista ordenados por nombre:");
            ListaPersonas.forEach(persona -> System.out.println(persona));
            System.out.println();


            Collections.sort(ListaPersonas, new ComparadorEdadNombre());
            System.out.println("Elementos de la lista ordenados por edad: ");
            ListaPersonas.forEach(persona -> System.out.println(persona));
            System.out.println();

            Collections.sort(ListaPersonas, new ComparadorNombreEdad());
            System.out.println("Elementos de la lista ordenados por Nombre: ");
            ListaPersonas.forEach(persona -> System.out.println(persona));
            System.out.println();

        }
    }


}
