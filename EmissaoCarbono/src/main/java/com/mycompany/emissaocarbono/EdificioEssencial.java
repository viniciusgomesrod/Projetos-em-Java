/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emissaocarbono;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author viniciusgomesrodrigues
 */
public class EdificioEssencial extends Edificio implements IEdificio {
    
    private List<Gerador> geradores;

    public EdificioEssencial(double consumoMensal, List<Gerador> geradores) {
        super(consumoMensal);
        this.geradores = new ArrayList<>();
    }

    @Override
    public double calcularPegadaCarbono() {
        
        double consumoBasico = consumoMensal * 0.20;
        double consumoGeradores = 0.0;
        
        for(Gerador gerador : geradores) {
            consumoGeradores += gerador.calcularPegadaCarbono();
        }
        
        return consumoBasico + consumoGeradores;
    }
    
    public void adicionarGerador(Gerador gerador) {
        geradores.add(gerador);
    }
    
}
