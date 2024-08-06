package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nDigite o nome do aluno: ");
        String nome = entrada.nextLine();
        System.out.printf("\nDigite a nota de %s: ", nome);
        float nota = entrada.nextFloat();
        System.out.printf("\nA nota de %s é: %.2f\n", nome, nota);
    }
}
