package ProgramacionDeclarativa;

import java.util.Arrays;
import java.util.stream.DoubleStream;
/*Eleaborado por Alejandro Martínez Faustino*/
public class funcion {
    public static void main(String[] args) {
        double[] calificaciones = {3.2, 10.0, 6.7, 5.1, 4.6, 7.8, 8.2, 7.5, 5.8, 8.7};

        System.out.println("Calificaciones originales: ");
        DoubleStream.of(calificaciones).forEach(c -> System.out.printf("%,.2f ", c));

        double promedio = DoubleStream.of(calificaciones)
                .filter(c -> c >= 6.0)
                .average()
                .orElse(0.0);
        System.out.println("\nEl promedio es de: " + promedio);

        long cantidad = DoubleStream.of(calificaciones)
                .filter(c -> c < 6)
                .count();
        System.out.println("Número de alumnos reprobados: " + cantidad);

        double Max = Arrays.stream(calificaciones)
                .filter(c -> c >= 6 && c <= 8.0)
                .max()
                .orElse(Double.NaN);
        System.out.println("La calificación máxima entre 6 y 8 es: " + Max);

        double Min = Arrays.stream(calificaciones)
                .filter(c -> c >= 4 && c <= 6)
                .min()
                .orElse(Double.NaN);
        System.out.println("La calificación minina entre 4 y 6 es: " + Min);

        System.out.println("Calificaciones con 1 punto añadido: ");
        DoubleStream.of(calificaciones)
                .map(c -> c + 1)
                .forEach(c -> System.out.printf("%,.2f ", c));


    }
}
