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


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }


    public int getAnio() {
        return anio;
    }


    public String getGenero() {
        return genero;
    }


    public String getPublisher() {
        return publisher;
    }


    public double getVentasNa() {
        return ventasNa;
    }


    public double getVentasEu() {
        return ventasEu;
    }


    public double getVentasJp() {
        return ventasJp;
    }


    public double getVentasGl() {
        return ventasGl;
    }


}
