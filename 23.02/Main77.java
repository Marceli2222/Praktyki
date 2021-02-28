package com.company;

import java.util.Scanner;
import static java.lang.Math.*;


public class Main77 {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Podaj  X");


        double x1 = scanner1.nextInt();
        double y1 = scanner2.nextInt();


        Scanner scanner3= new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Podaj  y");


        double x2 = scanner3.nextInt();
        double y2 = scanner4.nextInt();

double w;

w = sqrt((x2-x1)*(x2-x1) + (y2-y1) * (y2-y1));
        System.out.println( " Odległość to " + w );





    }


}