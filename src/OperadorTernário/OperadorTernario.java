package OperadorTernário;
import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        /* Modo 1: condição IF / ELSE:
        String indicacao = "";

        if (idade >= 18) {
            indicacao = "adulto";
        } else {
            indicacao = "crianca/adolescente";
        } */

        // Modo 02: usando operador ternário;
        String indicacao = (idade >= 18) ? "adulto" : "criança/adolescente";

        System.out.println("Resultado: " + indicacao);
    }
}

