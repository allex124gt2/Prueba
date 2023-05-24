package EjerciciosClase.Clases.ClasesGenericas;

public class Persona {
    String nombre;
    int edad;
    String sexo;
    String direccion;

    public Persona(String nombre, int edad, String sexo, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.direccion = direccion;
    }
@Override
    public String toString() {


        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Dirección: " + direccion);
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nSexo: " + sexo + "\nDirección: " + direccion;


    }
}

