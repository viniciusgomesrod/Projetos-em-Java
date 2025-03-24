/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bolha_insercao;

/**
 *
 * @author 1526526
 */
public interface IOrdenador<T>{
    public T[] ordenar(T[] dados);
    public int getComparacoes();
    public int getMovimentacoes();
    public double getTempoOrdenacao();
}
