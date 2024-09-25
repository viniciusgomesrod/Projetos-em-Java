/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoasheranca;

/**
 *
 * @author viniciusgomesrodrigues
 */
public class Professor extends Pessoa {
    
    private String especialidade;
    private float salario;
    
    public void receberAumento(float aum) {
        this.salario += aum;
        System.out.println("Salário com aumento: R$ " + this.salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
        System.out.println("Especialidade: " + this.especialidade);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
        System.out.println("Salária atual: R$ " + this.salario);
    }
    
    
}
