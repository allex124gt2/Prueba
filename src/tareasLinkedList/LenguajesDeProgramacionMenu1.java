package tareasLinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LenguajesDeProgramacionMenu1 {
    static LinkedList<String> listaLenguajesProgramacion = new LinkedList<>();

    public static void main(String[] args) {

        System.out.println("Programa elaborado por Alejandro Martínez Faustino");

        listaLenguajesProgramacion.add("C++");
        listaLenguajesProgramacion.add("Java");
        listaLenguajesProgramacion.add("Python");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLenguajes de Programación 2023");
            System.out.println("1. Añadir elemento");
            System.out.println("2. Añadir elemento al final");
            System.out.println("3. Añadir elemento al principio");
            System.out.println("4. Mostrar lista de lenguajes");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a agregar: ");
                    scanner.nextLine();
                    String elemento = scanner.nextLine();
                    listaLenguajesProgramacion.add(elemento);
                    break;
                case 2:
                    System.out.print("Ingrese el elemento a agregar al final: ");
                    scanner.nextLine();
                    String elementoFinal = scanner.nextLine();
                    listaLenguajesProgramacion.addLast(elementoFinal);
                    break;
                case 3:
                    System.out.print("Ingrese el elemento a agregar al principio: ");
                    scanner.nextLine();
                    String elementoInicio = scanner.nextLine();
                    listaLenguajesProgramacion.addFirst(elementoInicio);
                    break;
                case 4:
                    System.out.println("\nLista de lenguajes:");
                    for (String lenguaje : listaLenguajesProgramacion) {
                        System.out.println(lenguaje);
                    }
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor intente de nuevo.");
                    break;
            }
        }
    }
}

