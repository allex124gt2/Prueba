package ejerciciosDeClase1.figuras;

public class triangulo<perimetro> extends figura {
    String tipo;
    String angulos;
    double base1;
    double medida2;
    double medida3;
    double altura;
    double perimetro = base1+medida2+medida3;


    public triangulo(String nombre, int lados, String clasificacion, String tipo, String angulos, double base1,double medida2,double medida3, double altura) {
        super(nombre, lados, clasificacion);
        this.tipo = tipo;
        this.angulos = angulos;
        this.base1 = base1;
        this.medida2 = medida2;
        this.medida3 = medida3;
        this.altura = altura;
    }



    public void verTipo(){
        System.out.println("El tipo es: " + tipo);
    }

    public void verAngulos(){
        System.out.println("Los angulos son : " + angulos);
    }

    public  void verbase1(){System.out.println("La base es: " + base1);}

    public  void verMedida2(){System.out.println("La medida 2 es: " + medida2);}

    public  void verMedida3(){System.out.println("La medida 3 es: " + medida3);}

    public  void verAltura(){System.out.println("La altura es: " + altura);}



    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Lados: " + lados);
        System.out.println("Clasificación: " + clasificacion);
        System.out.println("Tipo: " + tipo);
        System.out.println("Base: " + base1);
        System.out.println("Medida 2: " + medida2);
        System.out.println("Medida 3: " + medida3);
        System.out.println("Altura: " + altura);


    }





}

