package com.company;

public class Main3 {

    public static void main(String[] args) {
        int i = -10;


        while( i<40 ){
            i++;
            if (Math.abs(i) %2 == 1)
                System.out.println(i);

        }
    }
}
