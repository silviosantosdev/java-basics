package EstruturaControleFor;
import java.util.Scanner;

public class EstruturaFor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Último número: ");
        int numeroFinal = entrada.nextInt();

        //FOR (inicialização -> condição -> incremento)
        for (int i = 1; i <= numeroFinal; i++) {

            System.out.println(i);

        }
    }

}
