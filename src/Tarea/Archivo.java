package Tarea;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {


    private String nombreArchivo;

    public Archivo(String nombreA) {
        this.nombreArchivo = nombreA;
    }

    // Método para crear un archivo con el nombre dado
    public void crearArchivo() {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            try {
                PrintWriter salidaArchivo = new PrintWriter(nombreArchivo);
                System.out.println("El archivo " + nombreArchivo + " se ha creado.");
                salidaArchivo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Método para escribir una lista de libros en el archivo
    public void escribirEnArchivo(ArrayList<Book> ListBooks) {
        try {
            PrintWriter salidaArchivo = new PrintWriter(nombreArchivo);
            for (Book bookAux : ListBooks) {
                salidaArchivo.println(bookAux.formatoArchivo());
            }
            salidaArchivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para leer una lista de libros del archivo
    public ArrayList<Book> leerDeArchivo() {
        ArrayList<Book> ListBooks = new ArrayList<>();
        try {
            // Abrir el archivo
            File archivoLectura = new File(nombreArchivo);
            Scanner leerArchivo = new Scanner(archivoLectura);

            // Leer el archivo
            while (leerArchivo.hasNext()) {
                String linea = leerArchivo.nextLine();
                String[] valores = linea.split("\\|"); // Dividir por |
                String name = valores[0];
                String author = valores[1];
                String genre = valores[2];
                double rating = Double.parseDouble(valores[3]);
                Book bookAux = new Book(name, author, genre, rating);
                ListBooks.add(bookAux);
            }

            // Cerrar el archivo
            leerArchivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ListBooks;
    }
}


