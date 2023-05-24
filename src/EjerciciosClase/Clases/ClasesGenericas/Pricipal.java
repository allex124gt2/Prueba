package EjerciciosClase.Clases.ClasesGenericas;

public class Pricipal {
    public static void main(String[] args) {
        ClaseG<String> gen1 = new ClaseG<>("Hola");
        System.out.println(gen1.getDato());
        Persona p1 = new Persona("pedro",13,"M","Atlacomulco");
        ClaseG <Persona>gen2 = new ClaseG<>(p1);
        System.out.println(gen2.getDato());



    }
}
