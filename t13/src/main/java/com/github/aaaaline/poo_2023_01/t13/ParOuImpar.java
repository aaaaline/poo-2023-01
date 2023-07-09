package com.github.aaaaline.poo_2023_01.t13;

import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        if (n%2 == 0) {
           System.out.println(n + " é um número par");
        } else {
            System.out.println(n + " é um número ímpar");
        }
    }
}