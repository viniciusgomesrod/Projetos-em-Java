/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emissaocarbono;

/**
 *
 * @author viniciusgomesrodrigues
 */
public abstract class Veiculo implements ICarbonEmitter {
    
    protected double eficiencia;
    protected double distancia;

    public Veiculo(double eficiencia, double distancia) {
        this.eficiencia = eficiencia;
        this.distancia = distancia;
    }
    
    
    
    @Override
    public abstract double calcularPegadaCarbono();
    
}
