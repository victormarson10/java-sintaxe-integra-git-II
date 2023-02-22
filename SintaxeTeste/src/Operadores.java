import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {

        int primeironumero;
        int segundonumero;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        primeironumero = scanner.nextInt();
        System.out.println(primeironumero);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Digite o segundo valor");
        segundonumero = scanner1.nextInt();
        System.out.println(segundonumero);

        String simNaoResult;
        /*boolean simNao;*/

        boolean simNao = primeironumero == segundonumero;

        /* String simNaoResult = (simNao = false ? "Falso" : "Verdadeiro"); */

        if (simNao) {
            simNaoResult = "O número " + primeironumero + " é igual ao " + segundonumero + "!";
        } else {
            simNaoResult = "O número " + primeironumero + " não é igual ao " + segundonumero + "!";
        }

        System.out.println("Número " + primeironumero + " é igual ao número " + segundonumero + "? " + simNaoResult);
    }
}