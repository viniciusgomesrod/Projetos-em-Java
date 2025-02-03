/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursividade;
import java.util.Scanner;

/**
 *
 * @author 1526526
 */
public class Recursividade {
    
    public static int somaPares(int limite){
            if(limite == 0) {
                return 0;
            } else if(limite % 2 == 0) {
                return limite + somaPares(limite - 1);
            } else {
                return 0 + somaPares(limite - 1);
            }
        }

    public static double somaVetor(double[] v, int i) {
        if(i < 0) {
            return 0;
        } else {
            return v[i] + somaVetor( v, i - 1);
        }
    }
            
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int opcao;
        
        do{
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Somar números inteiros pares");
            System.out.println("2 - Somar números decimais");
            System.out.println("3 - Contar quantas vezes um número aparece na lista");
            System.out.println("4 - Sair");
            opcao = leitor.nextInt();
        
        
        switch(opcao) {
            case 1: 
                System.out.println("Quantos números quer digitar?");
                int limite = leitor.nextInt();
                int resultado = somaPares(limite);
                System.out.println("Resultado " + resultado);
                    break;
            case 2:
                System.out.println("Defina o tamanho inteiro do vetor");
                int tamanho = leitor.nextInt();
                double vetor[] = new double[tamanho];
                for(int j = 0; j < tamanho; j++) {
                    vetor[j] = leitor.nextDouble();
                }
                    break;
            case 3: 
                System.out.println("Opção 3 selecionada.");
                    break;
            }
        } while (opcao!= 4);

    }
}
