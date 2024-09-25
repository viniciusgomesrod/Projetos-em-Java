/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoasheranca;

/**
 *
 * @author viniciusgomesrodrigues
 */
public class Aluno extends Pessoa {
    
    private int matricula;
    private String curso;
    
    public void cancelarMatricula() {
        System.out.println("Matrícula será cancelada");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
        System.out.println("Matrícula: " + this.matricula);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
        System.out.println("Curso: " + this.curso);
    }
    
    
    
}
