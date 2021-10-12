package Exercícios;
import java.util.Scanner;

public class MultaVeículo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Tipo do veículo (passeio, caminhao): ");
        String tipoVeiculo = entrada.nextLine();

        System.out.println("Velocidade máxima da via: ");
        int velocidadeMaxima = entrada.nextInt();

        System.out.println("Velocidade do veículo");
        int velocidadeVeiculo = entrada.nextInt();


        /* Versão 1 = usando IF e ELSE
        if (tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidadeMaxima * 1.1) {
            System.out.println("Multa");
        } else if (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidadeMaxima * 1.05) {
            System.out.println("Multa.");
        */

        //Versão 2 = usando IF e "ou" ||:
        if ((tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidadeMaxima * 1.1) ||
            (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidadeMaxima * 1.05)) {
                System.out.println("Multa.");
        }
    }
}
