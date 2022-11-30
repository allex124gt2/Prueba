package ProyectoExamen;

public class Producto {
    String fechaCaducidad, numeroLote;

    public Producto(String fechaCaducidad, String numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    public void setFechaCaducidad(String fecha) {
        fechaCaducidad = fecha;
    }

    public void setNumeroLote(String num) {
        numeroLote = num;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void imprimirInfo() {
        System.out.println("Fecha de caducidad: " + getFechaCaducidad() + "\nNúmero de lote: " + getNumeroLote());
    }
}
