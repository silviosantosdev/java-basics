package EscopoDeVariáveis;
import java.util.Scanner;

public class PodeDirigir {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Favor informar a sua idade: ");
        int idade = entrada.nextInt();

        boolean podeDirigir = idade >= 18;
        String nomePai = "";

        if (!podeDirigir) {
            System.out.println("Informe o nome do seu pai: ");

            nomePai = entrada.next();
        }

        System.out.println("Você pode dirigir? ");

        if (podeDirigir) {
            System.out.println("Sim, claro! ");

        } else {
            System.out.println("Não! E se insistir, seu pai " + nomePai + " pode ir preso!");
        }
    }
}
