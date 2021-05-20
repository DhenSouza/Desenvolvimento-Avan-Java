package digitalInnovation.FatorialRecursivo;

public class FuncaoComLambda {
    public static void main(String[] args) {
        Funcao colocarPreficoSenhorNaString = valor -> "Sr. "+ valor;
        System.out.println(colocarPreficoSenhorNaString.gerar("João"));
    }
}
