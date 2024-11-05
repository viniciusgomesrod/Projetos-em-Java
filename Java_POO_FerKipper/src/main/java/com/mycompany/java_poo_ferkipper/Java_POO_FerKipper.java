/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_poo_ferkipper;

import java.util.ArrayList;

/**
 *
 * @author viniciusgomesrodrigues
 */
public class Java_POO_FerKipper {

    public static void main(String[] args) {
// 
//        Carro meuCarro = new Carro("Fusca");
        
//        meuCarro.acelerar();
//        
        
        byte a = 100;
        short b = 10000;
        int c = 100000;
        long d = 100000L;
        float e = 10.5f;
        double f = 20.5;
        char g = 'A';
        String str = "Vinicius"; 
        boolean bool = false;
        
        int [] colecaoDeInteiros = {1, 2, 3, 4, 5, 333}; // VETOR TEM TAMANHO FIXO E NAO PODE SER MANIPULADO DE FORMA DINAMICA
        
        ArrayList<String> nomes = new ArrayList<>();

        if(str == "Vinicius") {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
        
        System.out.println(colecaoDeInteiros[5]);
        
        nomes.add("Vinicius");
        nomes.add("Fernando");
        nomes.add("Maria");
        nomes.add("Joao");
        nomes.add("Leo");
        
        System.out.println("Nome antes de remover ele do indice " + nomes.get(0));
        
        nomes.remove(0);
        
        System.out.println("Nome depois de remover o indice 0 " + nomes.get(0));
        
        for(int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
        
        for(String nome : nomes) {                      // DECLARA O TIPO (STRING) DE CADA ITEM (NOME) 
            System.out.println(nome);                   // E QUAL A VARIAVEL QUE VAI ITERAR SOBRE ELE (NOMES) 
        }
        
        
        // INICIO CÓDIGO DE INTERFACE:
        
        // Carro carro1 = new Carro("Onix"); VAI DAR ERRO SE FIZER ISSO, POIS INTERFACE NAO PODE SER INSTANCIADA DE FATO
        
        Carro carro1 = new Sandero();
        Carro carro2 = new Mobi();
        
        carro1.acelerar();
        carro2.acelerar(); // CONSEGUE CHAMAR O METODO POIS É PUBLICO/PROTECTED JA QUE ESTAO NO MESMO PACOTE
                           // SE FOSSE PRIVADO NÃO CONSEGUE NEM SE FOR DO MESMO PACOTE
                           
        // FIM CÓDIGO DE INTERFACE
        
        
        // INICIO CÓDIGO DE CLASSE ABSTRATA:
        
        // SerVivo servivo1 = new SerVivo(); VAI DAR ERRO POIS CLASSE ABSTRATA SÓ É CHAMADA ATRAVÉS DE CLASSE CONCRETA DE SUBTIPO
        
        SerVivo servivo1 = new Humano(); // JEITO CERTO DE CRIAR UMA CLASSE ABSTRATA (GENERICA) E CLASSE ESPECIALIZADA        
        
        servivo1.respirar();
        
        // FIM CÓDIGO DE CLASSE ABSTRATA
        
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        
    }
}
