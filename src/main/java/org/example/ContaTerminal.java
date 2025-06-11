package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao LuBank! Para criar sua conta basta digitar seu nome completo e depositar a quantia desejada.");
        System.out.print("Por favor digite seu nome completo: ");
        String nomeCliente = scanner.nextLine();
        nomeCliente = nomeCliente.toUpperCase();
        System.out.println("Nome digitado: " + nomeCliente);

        System.out.print("Digite saldo que você deseja depositar: ");
        BigDecimal saldo = scanner.nextBigDecimal();
        System.out.println("O saldo depositado foi de: " + saldo);

        int numeroConta = (int) (Math.random() * 9000) + 1000;

        int numeroAgencia = (int) (Math.random() * 900) + 100;
        int digitoAgencia = (int) (Math.random() * 10);
        String agencia = numeroAgencia + "-" + digitoAgencia;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + ", Conta: " + numeroConta + " e seu Saldo: " + saldo + " já esta disponível para saque.");
    }

}