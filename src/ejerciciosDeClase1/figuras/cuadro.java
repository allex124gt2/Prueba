package ejerciciosDeClase1.figuras;

public class cuadro {

    double lado;
    double perimetro;
    double area;


    public cuadro(double lado) {

        this.lado = lado;


    }


    public double verPerimetro() {
        perimetro = lado + lado + lado + lado;
        return perimetro;
    }

    public double verArea() {

        area = lado * lado;
        return area;
    }


    public void mostrarInfo() {

        System.out.println("Area: " + verArea());
        System.out.println("Perimetro: " + verPerimetro());


    }


}




