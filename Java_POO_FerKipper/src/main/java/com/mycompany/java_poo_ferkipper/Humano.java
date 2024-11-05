/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_poo_ferkipper;

/**
 *
 * @author viniciusgomesrodrigues
 */
public class Humano extends SerVivo {

    String nome = "Vinicius Gomes";
    
    public Humano() {
        super(18); // NO CONSTRUTOR DA CLASSE ESPECIALIZADA PRECISA CRIAR NO CONSTRUTOR, UMA INSTANCIA DA CLASSE GENERICA COM OS PARAMETROS
        this.nome = nome;
    }
    
    @Override // PRECISA IMPLEMENTAR O MÉTODO ABSTRATO E ESTATICO DA CLASSE ABSTRATA MÃE
    public void respirar() {
        System.out.println("Humano" + this.nome + "de " + this.idade + " anos, inspira oxigênio e expira gás carbônico...");
    }
    
    
    
}
