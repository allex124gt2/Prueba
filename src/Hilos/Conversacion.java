package Hilos;

public class Conversacion {
    public static void main(String[] args) {
        String dialog1M = "megm: Hi, there!\n";
        String dialog1K = "kathio: Hi Meg!\n";
        String dialog2M = "megm: What are you doing?\n";
        String dialog2K = """
                kathio: I'm sitting on my bed with my\s
                        laptop. I'm doing my homework
                """;
        String dialog3M = "megm: What are you working on?\n";
        String dialog3K = """
                kathyo: I'm writing an essay for Spanish\s
                        class. :) where are you?
                """;
        String dialog4M = """
                megm: I'm in a café with my friend Carmen.\s
                      I'm having coffee, and she's talking on\s
                      the phone outside. How is your family?
                """;
        String dialog4K = """
                kathyo: The're all fine! My father's\s
                        whatching a baseball game with his\s
                        friends. My mother is out shopping.
                """;
        String dialog5M = "megm: Where's your brother?\n";
        String dialog5K = """
                kathio: John's playing soccer in the park. Oh,\s
                        wait. My phone is ringing. My mother's\s
                        calling me. I have to go! Bye!
                """;
        String dialog6M = "megm: OK! Bye!";

        EscrituraLenta.escribir(dialog1M, 20);
        pausa(2000);
        EscrituraLenta.escribir(dialog1K, 20);
        pausa(2000);
        EscrituraLenta.escribir(dialog2M, 20);
        pausa(2000);
        EscrituraLenta.escribir(dialog2K, 20);
        pausa(2000);
        EscrituraLenta.escribir(dialog3M,20);
        pausa(2000);
        EscrituraLenta.escribir(dialog3K, 20);
        pausa(2000);
        EscrituraLenta.escribir(dialog4M, 20);
        pausa(2000);
        EscrituraLenta.escribir(dialog4K, 20);
        pausa(2000);
        EscrituraLenta.escribir(dialog5M,20);
        pausa(2000);
        EscrituraLenta.escribir(dialog5K, 20);
        pausa(2000);
        EscrituraLenta.escribir(dialog6M,20);
    }
    public static void pausa(int tiempo){
        System.out.println();
        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
