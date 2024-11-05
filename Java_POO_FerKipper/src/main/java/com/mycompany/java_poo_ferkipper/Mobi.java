/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_poo_ferkipper;

/**
 *
 * @author viniciusgomesrodrigues
 */
public class Mobi implements Carro {
    
    @Override // SOBRESCREVE O MÉTODO DA INTERFACE, PARA ENTÃO CRIAR/IMPLEMENTAR ELES NA CLASSE QUE CUMPRE O CONTRATO
    public void acelerar() { 
        System.out.println("Acelerando a 30 km/h.");
    }

    @Override
    public void freiar() { 
        
    }

    @Override
    public void parar() {
        
    }
    
}
