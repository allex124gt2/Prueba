package ProgramacionDeclarativa.tarea;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {
        private String nombreArchivo;

        public Archivo(String nombreA) {
            this.nombreArchivo = nombreA;
        }

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

        public void escribirEnArchivo(ArrayList<Empleado> ListEmpleados) {
            try {
                PrintWriter salidaArchivo = new PrintWriter(nombreArchivo);
                for (Empleado EmpAux : ListEmpleados) {
                    salidaArchivo.println(EmpAux.formatoArchivo());
                }
                salidaArchivo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public ArrayList<Empleado> leerDeArchivo() {
            ArrayList<Empleado> ListEmpleados = new ArrayList<>();
            try {
                // Abrir el archivo
                File archivoLectura = new File(nombreArchivo);
                Scanner leerArchivo = new Scanner(archivoLectura);

                // Leer el archivo
                while (leerArchivo.hasNext()) {
                    String linea = leerArchivo.nextLine();
                    String[] valores = linea.split("\\|");//Dividir por |
                    String primerNombre = valores[0];
                    String apellidoPaterno = valores[1];
                    double salario = Double.parseDouble(valores[2]);
                    String departamento = valores[3];
                    Empleado EmpAux = new Empleado(primerNombre, apellidoPaterno, salario, departamento);
                    ListEmpleados.add(EmpAux);
                }

                // Cerrar el archivo
                leerArchivo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return ListEmpleados;
        }
    }

