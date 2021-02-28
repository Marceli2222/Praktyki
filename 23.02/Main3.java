package com.company;

import java.util.Scanner;

public class Main3
{

    public static void main(String[] args){
        double Fahrenheit;
        System.out.println("Witamy w zmianie Stopni Celcjusze na Fahrenheity ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj celcjusza");
        double Celcjusz = scanner.nextDouble();
        Fahrenheit = (1.8 * Celcjusz) + 32;
        System.out.println("O to wynik:" +Fahrenheit+" F." );







    }









}
