package EjerciciosClase.ErrorArchivo;

public class Clase1310 {
    private static String mensaje = "Hola";
    private static int numero(int v1){
        return v1;
    }

    public static void main(String[] args) {
        Clase1310 obj1 = new Clase1310();
        Clase1310 obJ2 = new Clase1310();
        obJ2.mensaje = "Mundo";
        obj1.mensaje  = "bien";
        System.out.println(obj1.mensaje);
        System.out.println(obJ2.mensaje);
        System.out.println(Clase1310.mensaje);
        System.out.println("El valor es: " + Clase1310.numero(6));
    }
}

