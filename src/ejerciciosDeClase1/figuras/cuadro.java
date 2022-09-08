package ejerciciosDeClase1.figuras;

public class cuadro extends figura {

    double lado;
    double perimetro;
    double area;


    public cuadro(String nombre, int lados, String clasificacion, double lado) {
        super(nombre, lados, clasificacion);
        this.lado = lado;


    }





    public double verPerimetro(){
        perimetro = lado+lado+lado+lado;
        return perimetro;
    }
    public double verArea(){

        area=lado*lado;
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




