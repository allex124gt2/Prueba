package ejerciciosDeClase1;

public class estudiante extends herencia {
    String noCuenta;
    String curso;
    String calificacion;
    public estudiante(String nombre, int edad, String sexo, String direccion, String noCuenta,String curso,String calificacion) {
        super(nombre, edad, sexo, direccion);
        this.noCuenta = noCuenta;
        this.curso = curso;
    }

    public void verCalificacion(){
        System.out.println("La calificación es: " + calificacion);
    }

    public void verCurso(){
        System.out.println("El curso es: " + curso);
    }

    public  void verCalificación(){
        System.out.println("La calificación es: " + calificacion);

    }
}
