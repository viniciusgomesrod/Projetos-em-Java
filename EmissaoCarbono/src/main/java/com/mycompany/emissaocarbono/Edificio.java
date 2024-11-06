/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emissaocarbono;

/**
 *
 * @author viniciusgomesrodrigues
 */
public abstract class Edificio implements ICarbonEmitter{
    
    protected double consumoMensal;
    
    public Edificio(double consumoMensal) {
        this.consumoMensal = consumoMensal;
    }
    
    @Override
    public abstract double calcularPegadaCarbono();

    public double getConsumoMensal() {
        return consumoMensal;
    }

    public void setConsumoMensal(double consumoMensal) {
        this.consumoMensal = consumoMensal;
    }    
    
}
