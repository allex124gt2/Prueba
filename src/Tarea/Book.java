package Tarea;

public class Book {

    private String name;
    private String author;
    private String genre;
    private double rating;

    public Book(String name, String author, String genre, double rating) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
    }

    // Métodos de acceso a los campos privados
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    // Método para obtener una cadena en formato de archivo
    public String formatoArchivo() {
        return name + "|" + author + "|" + genre + "|" + rating;
    }

    // Método para representar una instancia de Book como cadena
    @Override
    public String toString() {
        return "Book[" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ']';
    }
}


