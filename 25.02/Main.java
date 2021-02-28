package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Podaj wielkość tablicy");
        Scanner scanner = new Scanner(System.in);
                int w = scanner.nextInt();
         String[]     table = new String[w];

         Scanner scanner2 = new Scanner(System.in);

         for( int i = 0 ; i<w; i++){
         table[i] = scanner2.nextLine();
        }
for(int i = 0; i < w; i++ )
    System.out.println(table[i]);
    }
}









