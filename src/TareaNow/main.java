package TareaNow;

import java.util.*;
/* Elaborado por Alejandro Martínez Faustino*/
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("John", "IT", 1, 25000, "Programmer"));
        empleados.add(new Empleado("Mary", "HR", 2, 30000, "Manager"));
        empleados.add(new Empleado("Bob", "IT", 3, 35000, "Programmer"));
        empleados.add(new Empleado("Jane", "Finance", 4, 40000, "Accountant"));
        empleados.add(new Empleado("Alice", "Sales", 5, 30000, "Sales Manager"));
        empleados.add(new Empleado("David", "IT", 6, 40000, "Programmer"));
        empleados.add(new Empleado("Samuel", "Finance", 7, 30000, "Accountant"));
        empleados.add(new Empleado("Julia", "Sales", 8, 30000, "Sales Manager"));
        empleados.add(new Empleado("Frank", "HR", 9, 50000, "Manager"));
        empleados.add(new Empleado("Grace", "Finance", 10, 30000, "Accountant"));
        empleados.add(new Empleado("Mark", "IT", 11, 60000, "Programmer"));

        int opcion;
        do {
            System.out.println("1. Ordenar por salario");
            System.out.println("2. Ordenar por departamento");
            System.out.println("3. Ordenar por departamento y por puesto");
            System.out.println("4. Ordenar por departamento y por salario");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opción no válida. Introduzca un número.");
                scanner.next(); // Limpia la entrada no válida del escáner
                continue;
            }

            switch (opcion) {
                case 1:
                    Collections.sort(empleados, new ComparadorSalario());
                    System.out.println("Elementos de la lista ordenados por Salario:");
                    empleados.forEach(Empleado -> System.out.println(Empleado));
                    System.out.println();
                    break;
                case 2:
                    Collections.sort(empleados, new ComparadorDepartamento());
                    System.out.println("Elementos de la lista ordenados por Departamento:");
                    empleados.forEach(Empleado -> System.out.println(Empleado));
                    System.out.println();
                    break;
                case 3:
                    Collections.sort(empleados, new ComparadorDepartamentoPuesto());
                    System.out.println("Elementos de la lista ordenados por Departamento y Puesto:");
                    empleados.forEach(Empleado -> System.out.println(Empleado));
                    System.out.println();
                    break;
                case 4:
                    Collections.sort(empleados, new ComparadorDepartamentoSalario());
                    System.out.println("Elementos de la lista ordenados por Departamento y Salario:");
                    empleados.forEach(Empleado -> System.out.println(Empleado));
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        } while (true);
    }
}





