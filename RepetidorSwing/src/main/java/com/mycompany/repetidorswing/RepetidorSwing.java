/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repetidorswing;

import javax.swing.JOptionPane;

/**
 *
 * @author viniciusgomesrodrigues
 */
public class RepetidorSwing {

    public static void main(String[] args) {
        
        int n, s = 0;
        int total = 0; 
        int pares = 0, impares = 0;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número:  <br><em>(0 para fechar)</em></html>"));
            s += n;
            total++;
            
            if (n % 2 == 0){
                pares++;
            } else {
                impares++;
            }
            
        } while (n != 0);
        JOptionPane.showMessageDialog(null, 
                "<html><div style='text-align: center;'>" + "<strong>RESUMO</strong>" +
                "<hr>" +
                "<br>Quantidade de números: " + total + 
                "<br>Soma dos números: " + s + 
                "<br>Quantidade de pares: " + pares + 
                "<br>Quantidade de impares: " + impares + "</html>");
    }
}
