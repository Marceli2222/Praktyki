package com.company;

import java.awt.*;
import java.util.Scanner;

public class Remote {

    int chanel;
    int volume;
    int online;

    public Remote(int chanel, int volume, int online) {

        Scanner scan = new Scanner(System.in);
        System.out.println("TV jest wyłączone.");
        System.out.println("Chcesz je włączyć?");
        System.out.println("1-tak");
        System.out.println("0-nie");

        int wybor = scan.nextInt();
        if (wybor == 1) {
            this.online = online;
            this.chanel = chanel;
            this.volume = volume;

            System.out.println("MENU");
            System.out.println("1-zmiana kanału");
            System.out.println("2-zmiana głośności");

            System.out.println("3- wyłącz TV");
            System.out.println("kanał " + chanel);
            System.out.println("głośność " + volume);
            int wybor2 = scan.nextInt();

            switch (wybor2) {

                case 1: {
                    System.out.println("aktualny kanał to " + this.chanel);
                    System.out.println("1-góra 2-dół");
                    int wybor3 = scan.nextInt();
                    if (wybor3 == 1) {
                        System.out.println("ile kanałów ?");
                        int i = scan.nextInt();
                        int k1 = (chanel + i);
                        System.out.println("kanał :" + k1);
                    }
                    if (wybor3 == 2) {
                        System.out.println("ile kanałów ?");
                        int i = scan.nextInt();
                        int k1 = (chanel - i);
                        System.out.println("kanał :" + k1);
                    }
                }
                case 2: {
                    System.out.println("aktualna głośność to " + this.volume);
                    System.out.println("1-góra 2-dół");
                    int wybor5 = scan.nextInt();
                    if (wybor5 == 1) {
                        System.out.println("ile punktów ?");
                        int j = scan.nextInt();
                        int k2 = (volume + j);
                        System.out.println("głośność :" + k2);
                    }
                    if (wybor5 == 2) {
                        System.out.println("ile punktów ?");
                        int j = scan.nextInt();
                        int k2 = (volume - j);
                        System.out.println("głośność :" + k2);
                    }
                }
                case 3:{
                    System.out.println("wyłączyć ?");
                    System.out.println("1-tak ");
                    int wybor6 = scan.nextInt();
                    if(wybor6 == 1){
                        System.out.println("Wyłączenie TV");

                    }



                }

                default:
                    System.out.println("błąd podaj poprawnie komendę");


            }
        }
        else{
            System.out.println("TV wyłączone");
    }



    }

}
