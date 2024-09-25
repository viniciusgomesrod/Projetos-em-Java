/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoasheranca;

/**
 *
 * @author viniciusgomesrodrigues
 */
public class PessoasHeranca {

    public static void main(String[] args) {
        
        // PROGRAMA PRINCIPAL
        
       Pessoa p1 = new Pessoa();
       Aluno p2 = new Aluno();
       Professor p3 = new Professor();
       Funcionario p4 = new Funcionario();
       
       p1.setNome("Vinícius");
       p2.setNome("Maria");
       p3.setNome("Cláudio");
       p4.setNome("Fabiana");
       
       p1.setSexo("M");
       p1.setIdade(18);
       
       p2.setCurso("Engenharia de Software");
       p3.setEspecialidade("Banco de Dados");
       p4.setSetor("Financeiro");
       
       p3.setSalario(15750.25f);
       p3.receberAumento(550.20f);
       
       
       System.out.println(p1.toString());
       System.out.println(p2.toString());
       System.out.println(p3.toString());
       System.out.println(p4.toString());
       
    }
}
