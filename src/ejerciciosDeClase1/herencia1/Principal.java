package ejerciciosDeClase1.herencia1;


public class Principal {
    public static void main(String[] args) {
        herencia p1 = new herencia("María", 15, "F", "Jocotitlan");
        estudiante e1 = new estudiante("juan", 18, "F", "Atlacomulco", "254637", "Algebra", "8.5");
        p1.mostrarInfo();
        e1.mostrarInfo();
    }


}
