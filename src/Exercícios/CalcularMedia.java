package Exercícios;
import java.util.Scanner;

public class CalcularMedia {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("◙◙◙◙◙◙◙◙ Escola Menino Feliz ◙◙◙◙◙◙◙◙");
        System.out.println("◙◙◙◙◙◙◙◙ Cálculo de Média  ◙◙◙◙◙◙◙◙◙");
        System.out.println("◙◙ Digite a nota da primeira unidade: ◙◙");
        int notaPrimeiraUnidade = entrada.nextInt();

        System.out.println("◙◙ Digite a nota da segunda unidade: ◙◙");
        int notaSegundaUnidade = entrada.nextInt();

        System.out.println("◙◙ Digite a nota da terceira unidade: ◙◙");
        int notaTerceiraUnidade = entrada.nextInt();

        System.out.println("◙◙ Digite a nota da quarta unidade: ◙◙");
        int notaQuartaUnidade = entrada.nextInt();

        int mediaAnual = ((notaPrimeiraUnidade + notaSegundaUnidade + notaTerceiraUnidade + notaQuartaUnidade) / 4);


        System.out.println("◙◙ A média anual do aluno é: " + mediaAnual + "◙◙");

        //trocar IF/ELSE por FOR ?
        if (mediaAnual >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else if (mediaAnual <= 6.9) {
            System.out.println("Aluno está em recuperação.");
        }
        if (mediaAnual <= 5.0) {
            System.out.println("Aluno está reprovado.");
        }
    }
}


