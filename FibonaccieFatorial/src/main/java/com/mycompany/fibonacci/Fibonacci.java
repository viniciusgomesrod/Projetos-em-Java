package com.mycompany.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o número de termos da sequência de Fibonacci que você quer: ");
        int termos = teclado.nextInt();
        
        System.out.format("Sequência de %d termos:\n", termos);
        
        for (int i = 0; i < termos; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        teclado.close();  // Fecha o scanner após o uso
    }
}
