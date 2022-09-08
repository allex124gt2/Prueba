package ejerciciosDeClase1.figuras;



public class prueba {
        public static void main(String[] args) {
            figura f1 = new figura("cuadrado", 4, "cuadrado");
            triangulo t1 = new triangulo("Triangulo",3,"Por sus lados","isoceles","65,65,50",12,16.66,16.66);

            f1.mostrarInfo();
            t1.mostrarInfo();

        }
}
