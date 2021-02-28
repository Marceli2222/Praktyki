package com.company;

import java.util.Scanner;

public class Main5
{

    public static void main(String[] args){
        System.out.println("podaj cyfre od 1 do 7");
        Scanner scanner = new Scanner(System.in);
        String dzien = scanner.nextLine();


        switch (dzien) {

            case "1":

                System.out.println("Poniedziałek");
                break;

            case "2":

                System.out.println("Wtorek");
                break;

            case "3":

                System.out.println("Sroda");
                break;

            case "4":

                System.out.println("Czwartek");
                break;

            case "5":

                System.out.println("Piatek");
                break;

            case "6":

                System.out.println("Sobota");
                break;

            case "7":

                System.out.println("Niedziela");
                break;


            default:
                System.out.println("Nie znamy takiego dnia");
                break;

        }


    }
}
