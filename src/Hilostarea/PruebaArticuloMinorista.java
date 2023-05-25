package Hilostarea;

public class PruebaArticuloMinorista implements Runnable{
    public void run() {
        ArticuloMinorista articulo1 = new ArticuloMinorista("Chaqueta", 12, 59.95);
        ArticuloMinorista articulo2 = new ArticuloMinorista("Jeans de diseñador", 40, 34.95);
        ArticuloMinorista articulo3 = new ArticuloMinorista("Camisa", 20, 24.95);

        System.out.println("Artículo no.1: " + articulo1.getDescripcion() + ", unidades disponibles: " + articulo1.getUnidadesDisponibles() + ", precio: $" + articulo1.getPrecio());
        System.out.println("Artículo no.2: " + articulo2.getDescripcion() + ", unidades disponibles: " + articulo2.getUnidadesDisponibles() + ", precio: $" + articulo2.getPrecio());
        System.out.println("Artículo no.3: " + articulo3.getDescripcion() + ", unidades disponibles: " + articulo3.getUnidadesDisponibles() + ", precio: $" + articulo3.getPrecio());
    }

    public static void main(String[] args) {
        PruebaArticuloMinorista prueba = new PruebaArticuloMinorista();
        Thread hilo = new Thread(prueba);
        hilo.start();
    }
}
