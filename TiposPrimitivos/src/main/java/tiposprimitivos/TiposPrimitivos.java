
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author viniciusgomesrodrigues
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        
        System.out.format("Digite a idade de %s: ", nome);
        int idade = teclado.nextInt();
        String valor = Integer.toString(idade); //PASSANDO A IDADE (INTEIRO) PARA STRING
        
        System.out.format("Digite o CPF de %s: ", nome);
        long cpf = teclado.nextLong();

        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        
        System.out.format("\nNOME: %s\n NOTA: %.2f pontos\n IDADE: %s anos\n CPF: %d", nome, nota, idade, cpf);
    }
}
