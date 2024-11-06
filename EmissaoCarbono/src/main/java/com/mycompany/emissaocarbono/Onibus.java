/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emissaocarbono;

/**
 *
 * @author viniciusgomesrodrigues
 */
public class Onibus extends Veiculo {
    
    private static double distanciaRota;
    private static int viagensDiarias;
    private static final int DIAS_MES = 25;

    public Onibus(double eficiencia) {
       super(distanciaRota * viagensDiarias * DIAS_MES, eficiencia); // Calcula a distância mensal
    }
    
    public static void configurarRota(double distanciaRota, int viagensDiarias) {
        Onibus.distanciaRota = distanciaRota;
        Onibus.viagensDiarias = viagensDiarias;
    }
    
    public double calcularPegadaCarbono() {
        double distanciaTotal = distanciaRota * viagensDiarias * DIAS_MES;
        double pegadaCarbonoOnibus = (distanciaTotal / eficiencia) * 0.143;
        return pegadaCarbonoOnibus;
    }
    
}
