package digitalInnovation.aula2;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converterStringParaInteiro = string -> Integer.valueOf(string) * 2;
        System.out.println(retornarNomeAoContrario.apply("João"));
        System.out.println(converterStringParaInteiro.apply("20"));
    }
}
