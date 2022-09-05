package ejerciciosDeClase1.figuras;

public class figura {
    String nombre;
    int lados;
    String clasificacion;

    public figura(String nombre, int lados, String clasificacion) {
        this.nombre = nombre;
        this.lados = lados;
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLados() {
        return lados;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("lados: " + lados);
        System.out.println("clasificación: " + clasificacion);

    }
}

