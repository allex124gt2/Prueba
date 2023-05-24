package ProgramacionDeclarativa;

import java.util.stream.IntStream;

public class MostarArgumentoIterativo {
    public static void main(String[] args) {


        int[] valores = {1, 1, 2, 3, 1, 1, 12, 23, 123, 1};
        for (int i = 0; i < valores.length; i++){
            System.out.printf("%d", valores[i]);
        }

        System.out.println();

        IntStream.of(valores)
                .forEach(valor -> System.out.printf("%d", valor));


    }
}
