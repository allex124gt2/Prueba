package ejerciciosDeClase1.figuras;

public class figura {
    String nombre;
    int lados;
    String clasificacion;


    public String toString(){
        return "figura{}";
    }


    public figura(String nombre, int lados, String clasificacion) {
        this.nombre = nombre;
        this.lados = lados;
        this.clasificacion = clasificacion;
    }


    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("lados: " + lados);
        System.out.println("clasificación: " + clasificacion);

    }
}
