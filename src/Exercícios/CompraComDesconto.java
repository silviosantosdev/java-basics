package Exercícios;
import java.util.Scanner;


public class CompraComDesconto {

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("=== SUPERMERCADO DO POVÃO ===\n");
        System.out.print("Informe a quantidade desejada: ");
        int quantidade  = entrada.nextInt();

        double valorUnitario = 10.00;
        double valorComDesconto = 9.00;
        double valorTotal = quantidade * valorUnitario;
        double valorTotalDesconto = quantidade * valorComDesconto;

        if (quantidade <= 5) {
            System.out.println("Você comprou " + quantidade + " unidades do produto, " +
                    "totalizando R$ " + valorUnitario * quantidade);
            System.out.println("Nesta compra você está pagando R$ " + ((valorTotal * 17)/100) + " de ICMS.");
            System.out.println("Agradecemos à preferência, volte sempre!");
        } else {
            System.out.println("Você comprou " + quantidade + " unidades do produto, " +
                    "totalizando R$ " + valorComDesconto * quantidade);
            System.out.println("Nesta compra você está pagando R$ " + ((valorTotalDesconto * 17)/100) + " de ICMS.");
            System.out.println("Agradecemos à preferência, volte sempre!");
        }
    }
}
