package TareaNow;

/* Elaborado por Alejandro Martínez Faustino*/
public class Empleado {
    private String nombre;
    private String departamento;
    private String puesto;
    private int idNumero;
    private double salario;

    public Empleado(String nombre, String departamento, int idNumero, double salario, String puesto) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
        this.idNumero = idNumero;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getIdNumero() {
        return idNumero;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", idNumero='" + idNumero + '\'' +
                ", departamento='" + departamento + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario + '\'' +
                '}';
    }
}
