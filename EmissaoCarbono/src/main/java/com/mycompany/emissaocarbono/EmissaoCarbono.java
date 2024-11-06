/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.emissaocarbono;

import java.util.List;
import com.mycompany.emissaocarbono.EdificioEssencial;

/**
 *
 * @author viniciusgomesrodrigues
 */
public class EmissaoCarbono {

    public static void main(String[] args) {
        
        Edificio e1 = new EdificioResidencial(1400);
        System.out.println("Edifício residencial: " + e1.calcularPegadaCarbono());
        
        Gerador gerador1 = new Gerador(2000);
        Gerador gerador2 = new Gerador(2000);
        
        Edificio essencial = new EdificioEssencial(5321);
        essencial.adicionarGerador(gerador1);
        essencial.adicionarGerador(gerador2);
        
        System.out.println("Edifício essencial: " + essencial.calcularPegadaCarbono());
        
        // Configura os valores estáticos de todos os ônibus
        Onibus.configurarRota(30, 10); // Exemplo: 30 km por rota, 10 viagens por dia

        // Cria uma instância do ônibus com uma eficiência de combustível de 6 km por litro
        Onibus onibus1 = new Onibus(6);

        // Calcula e imprime a pegada de carbono do ônibus
        System.out.println("Pegada de carbono do ônibus: " + onibus1.calcularPegadaCarbono() + " m³");
        
        // Criando um automóvel com distância mensal de 1200 km e eficiência de combustível de 10 km por litro
        Automovel automovel1 = new Automovel(85, 10);

        // Calculando e exibindo a pegada de carbono
        System.out.println("Pegada de carbono do automóvel: " + automovel1.calcularPegadaCarbono() + " m³");
        
    }
}
