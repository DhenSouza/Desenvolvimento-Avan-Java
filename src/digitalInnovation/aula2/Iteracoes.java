package digitalInnovation.aula2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
    String[] nomes = {"Joao","Joao" ,"Paulo","Oliveira","Santos","Instrutor","Java"};
    Integer[] numeros = {1,2,3,4,5};
    imprimirNomesFiltrados(nomes);
    imprimirTodosNomes(nomes);
    }

    public static void imprimirNomesFiltrados(String... nomes){
        String nomesParaImprimir= "";
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("Joao")){
                nomesParaImprimir +="" + nomes[i];
            }
        }

        System.out.println("Nomes do FOR: " + nomesParaImprimir);


        String nomesParaImprimirDaStream = Stream.of(nomes).filter(nome -> nome.equals("Joao"))
                .collect(Collectors.joining()); // Pega um array de strings e transforma em uma string;

        System.out.println("Nomes do Stream: " + nomesParaImprimirDaStream);
    }

    public static void imprimirTodosNomes(String... nomes) {
        for (String nome : nomes) {
            System.out.println("imprimido pelo FOR: "+nome);
        }

                Stream.of(nomes)
                .forEach(nome -> System.out.println("Imprimido pelo forEach: " +nome)); // Ou assim ->  System.out::println
    }

    public void imprimirODobroDeCadaItemDaLista(Integer... numeros){
        for(Integer numero : numeros){
            System.out.println(numero*2);
        }
    }
    }

