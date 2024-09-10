/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fatorial;

import java.util.Scanner;

/**
 *
 * @author viniciusgomesrodrigues
 */
public class Fatorial {

    public static int fatorial (int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.format("Ex.: 4! = 4 x 3 x 2 x 1 = 24\n");
        System.out.format("Digite o número que deseja ter o fatorial: ");
        int n = teclado.nextInt();
        
        /*long fatorial = 1;
        for(int i = 1; i <= n; i++){
            fatorial *= i;
        }
        */
        
        System.out.format("\nO fatorial de %d é: %d", n, fatorial(n));
        
    }
}
