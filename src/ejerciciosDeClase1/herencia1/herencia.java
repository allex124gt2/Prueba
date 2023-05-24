package ejerciciosDeClase1.herencia1;

public class herencia {

    String nombre;
    int edad;
    String sexo;
    String direccion;

    public herencia(String nombre, int edad, String sexo, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.direccion = direccion;
    }

    public void mostrarInfo() {


        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Dirección: " + direccion);


    }
}
