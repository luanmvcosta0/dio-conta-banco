package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao LuBank!");
        System.out.println("Por favor digite seu nome completo.");
        String nomeCliente = scanner.nextLine();
        nomeCliente = nomeCliente.toUpperCase();
        System.out.println("Nome digitado: " + nomeCliente);

        System.out.println("Digite saldo que você deseja depositar");
        BigDecimal saldo = scanner.nextBigDecimal();
        System.out.println("O saldo depositado foi de: " + saldo);

        int numeroConta = (int) (Math.random() * 9000) + 1000;
    }

}