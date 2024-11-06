/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emissaocarbono;

/**
 *
 * @author viniciusgomesrodrigues
 */
public class Gerador {
    
    private double consumoGerador;

    public Gerador(double consumoGerador) {
        this.consumoGerador = consumoGerador;
    }
 
    public double calcularPegadaCarbono() {
        return consumoGerador * 0.35;
    }
    
}
