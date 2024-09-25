/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ufcpoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author viniciusgomesrodrigues
 */
public class UFCPOO {

    public static void main(String[] args) {
        
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Charles Bronx", "Brasil", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Pretty Boy", "França", 25, 1.80f, 75.0f, 8, 2, 4);
        l[2] = new Lutador("Snapshadow", "EUA", 23, 1.65f, 80.9f, 3, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.63f, 100.0f, 20, 3, 4);
        l[4] = new Lutador("Datena", "Brasil", 60, 1.80f, 110.5f, 11, 2, 1);
        l[5] = new Lutador("Pablo Marçal", "Brasil", 38, 1.85f, 90.0f, 11, 2, 1);
        
        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l[5], l[4]);
        UFC01.lutar();
        l[5].status();
        l[4].status(); 
        
        /*
        Scanner sc = new Scanner(System.in);
        ArrayList<Lutador> lutadores = new ArrayList<>();

        String resposta;
        do {
            System.out.println("=== Criar um novo lutador ===");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Nacionalidade: ");
            String nacionalidade = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura (m): ");
            float altura = sc.nextFloat();

            System.out.print("Peso (kg): ");
            float peso = sc.nextFloat();

            System.out.print("Vitórias: ");
            int vitorias = sc.nextInt();

            System.out.print("Derrotas: ");
            int derrotas = sc.nextInt();

            System.out.print("Empates: ");
            int empates = sc.nextInt();
            sc.nextLine(); // Consumir o newline

            // Criar e adicionar o lutador à lista
            Lutador lutador = new Lutador(nome, nacionalidade, idade, altura, peso, vitorias, derrotas, empates);
            lutadores.add(lutador);

            // Perguntar se o usuário deseja criar outro lutador
            System.out.print("Deseja criar outro lutador? (sim/não): ");
            resposta = sc.nextLine().toLowerCase();

        } while (resposta.equals("sim"));

        // Exibir status de todos os lutadores criados
        for (Lutador lutador : lutadores) {
            lutador.apresentar();
            lutador.status();
        }

        sc.close();
    }
 */
        
    }
}
