/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emissaocarbono;

/**
 *
 * @author viniciusgomesrodrigues
 */
public class Automovel extends Veiculo {


    public Automovel(double distancia, double eficiencia) {
        super(distancia, eficiencia);
    }
    
    
    @Override
    public double calcularPegadaCarbono() {
        double pegadaCarbonoAutomovel = (distancia / eficiencia) * 0.143;
        return pegadaCarbonoAutomovel;
    }
    
}
