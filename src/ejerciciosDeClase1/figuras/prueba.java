package ejerciciosDeClase1.figuras;

import java.util.Scanner;


public class prueba {
    public static void main(String[] args) {


        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        System.out.println("Programa para calcular areas y perimetros de " +
                "figuras.");

        while (!salir) {

            System.out.println("1. Triangulo");
            System.out.println("2. Cuadrado");

            System.out.println("Escoge una opcion");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado triangulo: ");
                    System.out.println("-------------------------------");
                    System.out.print("Ingrese el lado 1: ");
                    double base1 = sn.nextDouble();
                    System.out.print("Ingrese el lado 2: ");
                    double medida2 = sn.nextDouble();
                    System.out.print("Ingrese el lado 3: ");
                    double medida3 = sn.nextDouble();
                    triangulo t1 = new triangulo(base1, medida2, medida3);

                    t1.mostrarInfo();

                    break;
                case 2:
                    System.out.println("Ha seleccionado cuadrado:");
                    System.out.println("----------------------------");
                    System.out.println("Ingrese un lado");
                    double lado = sn.nextDouble();
                    cuadro c1 = new cuadro(lado);

                    c1.mostrarInfo();
                    break;
                case 3:
                    System.out.println("Imprimir datos: " + "\n");
                    System.out.println("Datos de area:");
                    System.out.println();
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 3");
            }

        }
    }
}







