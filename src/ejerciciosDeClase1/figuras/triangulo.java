package ejerciciosDeClase1.figuras;

public class triangulo {
    String tipo;
    String angulos;
    double base1;
    double medida2;
    double medida3;
    double perimetro;
    double area;


    public triangulo(double base1, double medida2, double medida3) {

        this.tipo = tipo;
        this.angulos = angulos;
        this.base1 = base1;
        this.medida2 = medida2;
        this.medida3 = medida3;

    }


    public double verPerimetro() {
        perimetro = base1 + medida2 + medida3;
        return perimetro;
    }

    public double verArea() {
        double s = (base1 + medida2 + medida3) / 2;
        area = Math.sqrt((s * (s - base1) * (s - medida2) * (s - medida3)));
        return area;
    }


    public void mostrarInfo() {

        System.out.println("Tipo: " + tipo);
        System.out.println("Base: " + base1);
        System.out.println("Medida 2: " + medida2);
        System.out.println("Medida 3: " + medida3);
        System.out.println("Area: " + verArea());
        System.out.println("Perimetro: " + verPerimetro());


    }


}

