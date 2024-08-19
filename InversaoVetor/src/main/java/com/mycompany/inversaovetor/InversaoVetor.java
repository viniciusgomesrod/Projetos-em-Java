/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inversaovetor;

import java.util.Scanner;

/**
 *
 * @author 1526526
 */
public class InversaoVetor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quer digitar quantas palavras? ");
        int quant = teclado.nextInt();
        teclado.nextLine();
        
        String[] palavras = new String[quant];
        
        for(int i = 0; i < quant; i++){
            System.out.format("Digite a palavra que deseja inverter: ", (i + 1));
            palavras[i] = teclado.nextLine();
        }
        
        System.out.println("Inversão de palavras...:");
        for(int j = quant - 1; j>= 0; j--){
            System.out.print(palavras[j] + " ") ;
        }
        
        teclado.close();
    }
    
}
