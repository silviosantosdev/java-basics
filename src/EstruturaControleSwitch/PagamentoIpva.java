package EstruturaControleSwitch;
import java.util.Scanner;

public class PagamentoIpva {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("▓▓▓▓▓ Departamento Nacional de Trânsito ▓▓▓▓▓");
        System.out.println("Para consultar a data de vencimento do IPVA \n do seu veículo, digite o final da placa: ");
        int finalPlaca = entrada.nextInt();

        switch (finalPlaca) {
            case 1:
                System.out.println("Vencimento: dia 11 de janeiro");
                break;
            case 2:
                System.out.println("Vencimento: dia 15 de janeiro");
                break;
            case 3:
                System.out.println("Vencimento: dia 20 de janeiro");
                break;
            case 4:
                System.out.println("Vencimento: dia 25 de janeiro");
                break;
            case 5:
                System.out.println("Vencimento: dia 30 de janeiro");
                break;
            case 6:
                System.out.println("Vencimento: dia 04 de fevereiro");
                break;
            case 7:
                System.out.println("Vencimento: dia 09 de fevereiro");
                break;
            case 8:
                System.out.println("Vencimento: dia 14 de fevereiro");
                break;
            case 9:
                System.out.println("Vencimento: dia 19 de fevereiro");
                break;
            case 0:
                System.out.println("Vencimento: dia 24 de fevereiro");
                break;
        }
    }
}
