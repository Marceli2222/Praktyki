package com.company;

public class Main5 {

    public static void main(String[] args) {

        System.out.println(c(27, 28)); }




public static int c (int i, int j) {
 if (j == 0)
 return i;
else




return c(j, i % j);





    }
}