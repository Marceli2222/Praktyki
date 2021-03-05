package com.company;

public class Main {

    public static void main(String[] args) {



        bookshop bookshop = new bookshop();
        bookshop.setAdress("4 maja");
       bookshop.setSize("10x10 (m) ");
        bookshop.setP1("Harri Potta");
        bookshop.setP2("Wiedźmak");
        bookshop.setP3("50 twarzy sadysty");
        bookshop.setP4("Swit");
        System.out.println(bookshop.getInformation());

        bakery bakery = new bakery();
        bakery.setAdress("Mickiewicza 74");
        bakery.setSize("13x20 (m) ");
        bakery.setP1("Chleb");
        bakery.setP2("Bagieta");
        bakery.setP3("Bułki");
        bakery.setP4("Rogal DDl");

        System.out.println(bakery.getInformation());

    }
}
