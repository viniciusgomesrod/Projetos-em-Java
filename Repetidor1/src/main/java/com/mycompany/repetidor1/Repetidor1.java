/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repetidor1;

import java.util.Scanner;

/**
 *
 * @author viniciusgomesrodrigues
 */
public class Repetidor1 {

    public static void main(String[] args) {
        
        System.out.format("Exercício 1:");
        int i = 0;
        while(i < 10) {
            i++;
            if (i == 2 || i == 3 || i == 4) {
                continue;
            }
            if (i == 7) {
                break;
            }
            System.out.println("Repetidor " + i);
        }
        
        System.out.format("\nExercício 2:");
        int j = 0;
        while(j < 10) {
            j++;
            System.out.print(j);
        }
        
        System.out.format("\nExercício 3:");
        Scanner teclado = new Scanner(System.in);
        char resp = 's';
        while(resp == 's' || resp == 'S') {
            System.out.format("\nQuer continuar? ");
            resp = teclado.next().charAt(0);
        }
        System.out.println("Pronto.");
        teclado.close();
    }
}
