package Ejercicio12042023;

public class videojuegos {
    private int indice;
    private String titulo;
    private String plataforma;
    private int anio;
    private String genero;
    private String publisher;
    private double ventasNa;
    private double ventasEu;
    private double ventasJp;
    private double ventasGl;

    public videojuegos(int indice, String titulo, String plataforma, int anio, String genero, String publisher, double ventasNa, double ventasEu, double ventasJp, double ventasGl) {
        this.indice = indice;
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.anio = anio;
        this.genero = genero;
        this.publisher = publisher;
        this.ventasNa = ventasNa;
        this.ventasEu = ventasEu;
        this.ventasJp = ventasJp;
        this.ventasGl = ventasGl;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getVentasNa() {
        return ventasNa;
    }

    public void setVentasNa(double ventasNa) {
        this.ventasNa = ventasNa;
    }

    public double getVentasEu() {
        return ventasEu;
    }

    public void setVentasEu(double ventasEu) {
        this.ventasEu = ventasEu;
    }

    public double getVentasJp() {
        return ventasJp;
    }

    public void setVentasJp(double ventasJp) {
        this.ventasJp = ventasJp;
    }

    public double getVentasGl() {
        return ventasGl;
    }

    public void setVentasGl(double ventasGl) {
        this.ventasGl = ventasGl;
    }



}
