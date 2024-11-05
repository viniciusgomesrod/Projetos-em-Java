/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_poo_ferkipper;

/**
 *
 * @author viniciusgomesrodrigues
 */
public abstract class SerVivo {
    
    public int idade; // PRECISA SER PUBLIC POIS É USADO NAS CLASSES ESPECIALIZADAS (FILHAS)
    
    public SerVivo(int idade) {
        this.idade = idade;
    }
    
    public abstract void respirar();
    
    public void dormir(){
        System.out.println("dormindo...");
    }
    
}
