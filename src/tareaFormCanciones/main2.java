package tareaFormCanciones;

import java.util.*;

public class main2 {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Ordenamiento por edad");
            System.out.println("2. Ordenamiento por apellido");
            System.out.println("3. Ordenamiento por nombre");
            System.out.println("4. Salir");

            try {

                List<persona> ListaPersonas = new ArrayList<>();
                ListaPersonas.add(new persona("Pedro", "Picapiedra", 40));
                ListaPersonas.add(new persona("Pablo", "Mármol", 38));
                ListaPersonas.add(new persona("Vilma", "De picapiedra", 35));
                ListaPersonas.add(new persona("Betty", "Mármol", 35));
                ListaPersonas.add(new persona("Tony", "Stark", 50));

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        Collections.sort(ListaPersonas, new ComparadorEdad());
                        System.out.println("Elementos de la lista ordenados por edad: ");
                        ListaPersonas.forEach(persona -> System.out.println(persona));
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        Collections.sort(ListaPersonas, new CompApe());
                        System.out.println("Elementos de la lista ordenados por apellido: ");
                        ListaPersonas.forEach(persona -> System.out.println(persona));
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        Collections.sort(ListaPersonas, new CompNombre());
                        System.out.println("Elementos de la lista ordenados por nombre: ");
                        ListaPersonas.forEach(persona -> System.out.println(persona));
                        System.out.println();
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
}
