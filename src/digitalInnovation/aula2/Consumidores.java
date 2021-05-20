package digitalInnovation.aula2;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        // Method Reference
//      -Apenas
//      - Utilizar o parametro de forma que ele foi recebido

        Consumer<String> imprimirUmaFrase = System.out::println;
       // Consumer<String> imprimirUmaFrase2 = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello Word");
    }
}
