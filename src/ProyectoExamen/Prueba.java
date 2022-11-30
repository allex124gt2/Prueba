package ProyectoExamen;

public class Prueba {
    public static void main(String[]args){
        ProductoCongelado alitas = new ProductoCongelado("11-09-2019","A2703114");
        ProductoFresco uvas = new ProductoFresco("10-06-2017","A1710003");
        ProductoRefrigerado leche = new ProductoRefrigerado("13-09-2015","A1407002");
        alitas.setTemperaturaRecomendada(-18);
        uvas.setFechaEnvasado("03-10-2015");
        uvas.setPaisDeOrigen("USA");
        leche.setCodigoSupervisionAlimentaria("G#4567");
        System.out.println("Producto Congelado: ");
        alitas.imprimirDatos();
        System.out.println("Producto Fresco: ");
        uvas.imprimirDatos();
        System.out.println("Producto Refrigerado: ");
        leche.imprimirDatos();
    }
}
