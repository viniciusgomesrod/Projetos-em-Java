/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emissaocarbono;

/**
 *
 * @author viniciusgomesrodrigues
 */
public class EdificioResidencial extends Edificio implements IEdificio, ICarbonEmitter {
    

    public EdificioResidencial(double consumoMensal) {
        super(consumoMensal);
        this.consumoMensal = consumoMensal;
    }

    
    
    @Override
    public double calcularPegadaCarbono() {
        return consumoMensal * 0.20;
    }
    
}
