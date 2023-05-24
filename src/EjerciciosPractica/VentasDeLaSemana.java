package EjerciciosPractica;

import java.util.stream.DoubleStream;
/*Elaborado por ALEJANDRO MARTINEZ FAUSTINO*/

public class VentasDeLaSemana {

    public static void main(String[] args) {

        System.out.println("Las ventas de la semanda son: ");
        double[] ventas = {23, 1256.52, 2125.89, 1788.89, 1990.25, 2560.20, 5689.52};
        DoubleStream.of(ventas).forEach(v -> System.out.printf("%.2f ", v));

        long ventasM100 = DoubleStream.of(ventas)
                .filter(c -> c > 1000)
                .count();
        System.out.println("\nEl número de Ventas que superaron los 1000 fue: " + ventasM100);

        System.out.println("El total de todas las ventas es: " + DoubleStream.of(ventas).sum());


        System.out.println("Ël número total de venta es: " + DoubleStream.of(ventas).count());

        double ventaMax = DoubleStream.of(ventas)
                .filter(v -> v >= 1000 && v <= 2000)
                .max()
                .orElse(Double.NaN);
        System.out.println("La venta máxima entre 1000 y 2000 es de: " + ventaMax);

        double ventaMiN = DoubleStream.of(ventas)
                .filter(v -> v >= 0 && v <= 500)
                .min()
                .orElse(Double.NaN);
        System.out.println("La venta minima entre 0 y 5000 es de: " + ventaMiN);


        double promedio = DoubleStream.of(ventas)
                .average()
                .orElse(Double.NaN);
        System.out.println("El promedio de ventas es de: " + promedio);
    }


}
