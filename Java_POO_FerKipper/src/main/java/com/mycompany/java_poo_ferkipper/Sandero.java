/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_poo_ferkipper;

/**
 *
 * @author viniciusgomesrodrigues
 */
public class Sandero implements Carro{

    /* 
    TODA CLASSE CONCRETA QUE IMPLEMENTA/CHAMA UMA INTERFACE ELA ->>>> DEVE IMPLEMENTAR TODOS OS METODOS DA INTERFACE <<<<<-
    ISSO OCORRE DEVIDO O CONTRATO, EM QUE TODA CLASSE CONCRETA DEVE IMPLEMENTAR OS METODOS DAS INTERFACES
    */
    
    final int limiteVelocidade = 150; // ATRIBUTO FINAL POIS NÃO VAI SER ALTERADO DEPOIS DE DECLARADO
    
    public int velocidadeAtual = 0;
    
    @Override // SOBRESCREVE O MÉTODO DA INTERFACE, PARA ENTÃO CRIAR/IMPLEMENTAR ELES NA CLASSE QUE CUMPRE O CONTRATO
    public void acelerar() { 
        if(this.velocidadeAtual < this.limiteVelocidade) {
            System.out.println("Acelerando");
            this.velocidadeAtual += 10;
            System.out.println("Velocidade atual: " + this.velocidadeAtual);
        } else {
            System.out.println("Atingiu o limite de velocidade de " + this.limiteVelocidade);
        }
        
        
    }

    @Override
    public void freiar() { 
        
    }

    @Override
    public void parar() {
        
    }
    
    
    
}
