package Ejercicio12042023;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class archivo {
    private String nombreArchivo;
    public archivo(String nombreA) {
        this.nombreArchivo = nombreA;
    }


    public ArrayList<videojuegos> leerDeArchivo() {
        ArrayList<videojuegos> listaVideojuegos = new ArrayList<>();
        try {
            // Abrir el archivo
            File archivoLectura = new File(nombreArchivo);
            Scanner leerArchivo = new Scanner(archivoLectura);

            // Leer el archivo
            while (leerArchivo.hasNext()) {
                String linea = leerArchivo.nextLine();
                String[] datos = linea.split("\\|");
                int indice = Integer.parseInt(datos[0]);
                String titulo = datos[1];
                String plataforma = datos[2];
                int anio = Integer.parseInt(datos[3]);
                String genero = datos[4];
                String publisher = datos[5];
                double ventasNa = Double.parseDouble(datos[6]);
                double ventasEu = Double.parseDouble(datos[7]);
                double ventasJp = Double.parseDouble(datos[8]);
                double ventasGl = Double.parseDouble(datos[9]);

                videojuegos videojuegoAux = new videojuegos(indice, titulo, plataforma, anio, genero, publisher, ventasNa, ventasEu, ventasJp, ventasGl);
                listaVideojuegos.add(videojuegoAux);
            }

            // Cerrar el archivo
            leerArchivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaVideojuegos;
    }



}



