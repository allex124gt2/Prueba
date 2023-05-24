package ejerciciosDeClase1.figuras;

public class rectangulo extends figura {

    double ladoH;
    double ladoV;
    double perimetro;
    double area;


    public rectangulo(String nombre, int lados, String clasificacion, double ladoH, double ladoV) {
        super(nombre, lados, clasificacion);
        this.ladoH = ladoH;
        this.ladoV = ladoV;


    }


    public double verPerimetro() {
        perimetro = ladoH + ladoH + ladoV + ladoV;
        return perimetro;
    }

    public double verArea() {

        area = ladoH * ladoV;
        return area;
    }


    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Lados: " + lados);
        System.out.println("Clasificación: " + clasificacion);
        System.out.println("Area: " + verArea());
        System.out.println("Perimetro: " + verPerimetro());


    }


}

