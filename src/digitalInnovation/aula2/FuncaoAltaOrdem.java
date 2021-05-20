package digitalInnovation.aula2;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo SOMA = (a,b) -> a+b;
        Calculo SUBTRACAO = (a,b) -> a-b;
        Calculo DIVISAO = (a,b) -> a/b;
        Calculo MULTI = (a,b) -> a*b;
        System.out.println(executarOperacao(SOMA,1,3));
        System.out.println(executarOperacao(SUBTRACAO,4,3));
        System.out.println(executarOperacao(DIVISAO,10,2));
        System.out.println(executarOperacao(MULTI,103,404));
    }

    public static int executarOperacao(Calculo calculo, int a, int b){
     return calculo.calcular(a,b);
    }

}

@FunctionalInterface
interface Calculo {
    public int calcular(int a, int b);
}
