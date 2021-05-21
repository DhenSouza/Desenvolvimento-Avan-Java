package digitalInnovation.aula2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
    String[] nomes = {"Joao","Joao" ,"Paulo","Oliveira","Santos","Instrutor","Java"};
    Integer[] numeros = {1,2,3,4,5};
    //imprimirNomesFiltrados(nomes);
    //imprimirTodosNomes(nomes);
    imprimirODobroDeCadaItemDaLista(numeros);
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

    public static void imprimirODobroDeCadaItemDaLista(Integer... numeros){ // os tres pontos significa um array mesmo coisa que Integer[]
        for(Integer numero : numeros){
            System.out.println(numero*2);
        }

        Stream.of(numeros)
                .map(numero -> numero*2)
                .forEach(System.out::println);
    }
    }

