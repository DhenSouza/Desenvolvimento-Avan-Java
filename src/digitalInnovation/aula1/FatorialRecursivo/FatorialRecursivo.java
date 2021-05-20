package digitalInnovation.FatorialRecursivo;

public class FatorialRecursivo {

    public static void main(String[] args) {
        System.out.println("Resultado é: " + fatorial(5));
    }

    public static int fatorial (int value ) {
        if(value == 1) {
            return value;
        } else {
            return value * fatorial((value -1));
        }
    }
    /* fatorial de: 5
    * 55 * 7 * 3 * 2 * 1
    * resultado: 120 */
}
