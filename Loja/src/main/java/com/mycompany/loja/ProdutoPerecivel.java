/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loja;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author 1526526
 */
public class ProdutoPerecivel extends Produto{
    
    LocalDate dataDeValidade = LocalDate.now();
    
    private static final double DESCONTO = 0.2;
    private static final double PRAZO_VALIDADE = 7;
    private static final int PRAZO_DESCONTO = 0;
    
    
    public ProdutoPerecivel(String desc, double precoCusto, double margemLucro, LocalDate validade) {
        super(desc, precoCusto, margemLucro);
        if(validade.isBefore(LocalDate.now())){
            throw new IllegalArgumentException("Validade anterior ao dia de hoje!"); 
        }
        this.dataDeValidade = validade;
    }
    
    @Override
    public double valorDeVenda() {
        double desconto = 0d;
        int diasValidade = LocalDate.now().until(dataDeValidade).getDays();
       if(diasValidade <= PRAZO_DESCONTO){
           desconto = DESCONTO;
       }
        return (precoCusto * (1 + margemLucro)) * (1 - desconto);
    }

    @Override
    public String toString() {
        DateTimeFormatter DateTimeFormatter;
        DateTimeFormatter formato = DateTimeFormatter
    }

    
    
}
