package com.github.aaaaline.poo_2023_01.t13;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        long factorial = multiplyNumbers(num);

        System.out.println(num + "! = " + factorial);
    }

    public static long multiplyNumbers(int num) {
        if(num >= 1) {
            return num * multiplyNumbers(num - 1);
        } else{
            return 1;
        }
    }
}