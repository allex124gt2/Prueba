package ProgramacionDeclarativa.tarea;

import java.util.List;

public class ProcesarEmpleados {
    public static void main(String[] args) {


        Archivo archivox = new Archivo("Empleados.txt");
        archivox.crearArchivo();
        List<Empleado> listaEmpleados = archivox.leerDeArchivo();

        System.out.println("Lista completa de empleados");
        imprimirEncabezado();
        listaEmpleados.stream().forEach(System.out::println);
        imprimirRenglon();
        List<Empleado> listaVazquez = listaEmpleados.stream()
                .filter(empleado -> empleado.getApellidoPaterno().equals("Vazquez"))
                .toList();
        System.out.println("\nLista de empleados de apellido Vazquez");
        imprimirEncabezado();
        listaVazquez.stream().forEach(System.out::println);
        imprimirRenglon();
        double sumaSueldos = listaEmpleados.stream().mapToDouble(Empleado::getSalario).sum();
        System.out.println("La suma de los sueldos de todos los empleados es: " + sumaSueldos);
        imprimirRenglon();
        double sumaSalarios = listaEmpleados.stream()
                .filter(empleado -> empleado.getSalario() <= 10000)
                .mapToDouble(Empleado::getSalario)
                .reduce(0, Double::sum);
        System.out.println("La suma de los salarios de los empleados con salario menor o igual a 10000 es: " + sumaSalarios);
        imprimirRenglon();
        System.out.println("Empleados del departamento Marketing");
        listaEmpleados.stream()
                .filter(empleado -> empleado.getDepartamento().equals("Marketing"))
                .forEach(empleado -> System.out.println(empleado.getPrimerNombre() + " " + empleado.getApellidoPaterno()));
        imprimirRenglon();
        double sueldoMaximoTI = listaEmpleados.stream()
                .filter(empleado -> empleado.getDepartamento().equals("TI"))
                .mapToDouble(Empleado::getSalario)
                .max()
                .orElse(Double.NaN);
        System.out.println("El sueldo más alto de los trabajadores de TI es: " + sueldoMaximoTI);
        imprimirRenglon();
        long numE = listaEmpleados.stream()
                .filter(empleado -> empleado.getDepartamento().equals("Ventas"))
                .count();
        System.out.println("Número de empleados de Ventas: " + numE);


    }

    public static void imprimirRenglon() {
        System.out.println();
        System.out.println("--------------------------------------------------------------------");
    }

    public static void imprimirEncabezado() {
        System.out.printf("%12s %12s %12s %12s%n", "Nombre", "Apellidos", "Salario", "Departamento");
        System.out.println("---------------------------------------------------------------");
    }


}


