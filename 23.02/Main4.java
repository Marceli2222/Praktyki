package com.company;


import java.util.Scanner;

public class Main4
{

    public static void main(String[] args) {


        System.out.println("podaj bok a");

        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();

        System.out.println("podaj bok b");

        Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();

        System.out.println("podaj bok c");

        Scanner scanner3 = new Scanner(System.in);
        int c = scanner3.nextInt();

        if ((c + b > a) && (a + c > b) && (a + c > b))
        System.out.println("Tak");

        else
        System.out.println("Nie");
    }
}
