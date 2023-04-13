package Ejercicio110042023;

public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    private int salario;
    private double coeficiente;

    public Persona(int id, String nombre, String apellido, int anioNacimiento, int salario, double coeficiente) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioNacimiento = anioNacimiento;
        this.salario = salario;
        this.coeficiente = coeficiente;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public int getSalario() {
        return salario;
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }
}
