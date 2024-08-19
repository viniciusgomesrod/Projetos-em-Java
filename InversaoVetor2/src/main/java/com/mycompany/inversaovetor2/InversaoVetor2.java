package com.mycompany.inversaovetor2;

import java.util.Scanner;

public class InversaoVetor2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a frase que deseja inverter: ");
        String frase = teclado.nextLine();
        
        // Converte a frase em um array de caracteres
        char[] fraseArray = frase.toCharArray();
        
        // Conta o número de palavras na frase
        int numPalavras = 0;
        for (char c : fraseArray) {
            if (c == ' ') {
                numPalavras++;
            }
        }
        numPalavras++; // Para contar a última palavra

        // Cria um array para armazenar as palavras
        char[][] palavras = new char[numPalavras][];
        
        int indexPalavra = 0;
        int inicioPalavra = 0;
        
        // Separa as palavras e armazena em arrays de caracteres
        for (int i = 0; i < fraseArray.length; i++) {
            if (fraseArray[i] == ' ' || i == fraseArray.length - 1) {
                int tamanhoPalavra = (i == fraseArray.length - 1) ? (i - inicioPalavra + 1) : (i - inicioPalavra);
                palavras[indexPalavra] = new char[tamanhoPalavra];
                for (int j = 0; j < tamanhoPalavra; j++) {
                    palavras[indexPalavra][j] = fraseArray[inicioPalavra + j];
                }
                indexPalavra++;
                inicioPalavra = i + 1;
            }
        }

        System.out.println("Inversão da frase...");
        for (int i = numPalavras - 1; i >= 0; i--) {
            for (char c : palavras[i]) {
                System.out.print(c);
            }
            System.out.print(" ");
        }
        
        teclado.close(); // Fechar o teclado
    }
}
