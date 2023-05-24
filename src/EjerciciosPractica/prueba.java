package EjerciciosPractica;
public class prueba {
    public static void main(String[] args) {
        String var1;

        var1 = "hola que onda";

        System.out.println(var1);

        if (var1.length() <= 13) {
            System.out.println("Es muy corto");
        } else {
            System.out.println("Es suficiente");
        }


        int a = 1;
        int b = 2;
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("Se alcanzo el máximo");
            i = a + b;
            i++;

        }


    }
}
