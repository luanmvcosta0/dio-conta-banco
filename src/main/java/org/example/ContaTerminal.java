package org.example;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao LuBank!");
        System.out.println("Por favor digite seu nome completo.");
        String nomeCliente = scanner.nextLine();
        nomeCliente = nomeCliente.toUpperCase();
        System.out.println("Nome digitado: " + nomeCliente);

    }

}