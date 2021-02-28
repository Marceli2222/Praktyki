package com.company;

import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        System.out.println("Podaj liczbę 1");


        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();


        System.out.println("Podaj liczbę 2");


        Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();


        System.out.println("Podaj liczbę 3");


        Scanner scanner3 = new Scanner(System.in);
        int c = scanner3.nextInt();

        if ((a > b) && (a > c)) {
            System.out.println(+a + " ");
            if (b > c)
                System.out.println(+ b + "" + "\n" + + c+ " ");
            else
                System.out.println(+ c + "" + "\n" + + b + " ");
        }
        else if ((b > a) && (b > c)) {
            System.out.println(+b+ " ");
            if (a > c)
                System.out.println(+ a + "" + "\n" + + c + " ");
            else
                System.out.println(+ c + "" + "\n" + + a + " ");
        }

        else {
        System.out.println(+c+ " ");
        if (b > a)
            System.out.println(+ b + "" + "\n" + + a + " ");
        else
            System.out.println(+ a + "" + "\n" + + b + " ");
    }



    }
}