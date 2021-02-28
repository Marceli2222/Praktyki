package com.company;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Stream;



public class Main2 {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Podaj wielkość ");



try {
    int W = scan.nextInt();
    int[] l = new int[W];


    System.out.println("Podaj wartość");
    int f1 = scan.nextInt();
    l[0] = f1;
    boolean K = false;

    int N = f1;
    int I = 1;

    while (!K) {

if (I == W - 1) {
  K = true;
  }

if (f1 % 2 == 0)
    l[I++] = N += 2;
        else {
   l[I++] = N+= 1;
    f1++;
        }
    }




for (int cyfra : l) {
System.out.print(cyfra + " ");
            }







System.out.println();
System.out.println("Min: "+ min(l));

System.out.println("Max: " + max(l));

System.out.println("Suma: " + sum(l));

System.out.println("Srednia: " + avg(l));

System.out.println("Mediana: " + median(l));


} catch (InputMismatchException ignored) {
            System.out.println("Podano błąd ");
}

    }
    public static int min(int[] l) {
OptionalInt s = Arrays.stream(l).min();
assert s.isPresent();
return s.getAsInt();
    }
    public static int max(int[] l) {
 OptionalInt possibleInt = Arrays.stream(l).max();
 assert possibleInt.isPresent();
 return possibleInt.getAsInt();
    }
    public static int sum(int[] l) {
return Arrays.stream(l).sum();
    }
    public static double avg(int[] l) {
double Suma = sum(l);
return Suma / l.length;
}
    public static double median(int[] l) {
  if (l.length % 2 == 0) {
return (double) (l[(l.length / 2) - 1] +
  l[(l.length / 2)]) / 2;
 } else {
 return l[(l.length / 2)];
  }

    }

}