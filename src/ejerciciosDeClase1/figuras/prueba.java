package ejerciciosDeClase1.figuras;



public class prueba {
        public static void main(String[] args) {
            figura f1 = new figura("cuadrado", 4, "cuadrado");
            triangulo t1 = new triangulo("Triangulo",3,"Por sus lados","isoceles","65,65,50",12,16.66,16.66);
            rectangulo r1 = new rectangulo("Rectangulo",4,"cuadrilátero",15,11);
            cuadro c1 = new cuadro("Cuadro",4,"Poligono regular",15);

            f1.mostrarInfo();
            t1.mostrarInfo();
            r1.mostrarInfo();
            c1.mostrarInfo();

        }
}
