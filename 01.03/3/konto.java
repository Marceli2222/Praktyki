package com.company;

import java.util.Scanner;

public class konto {
public int pieniądze = 100;
public int ID = 1;

 public static void main(String[] args) {

boolean e = true;
boolean w = true;
konto[] konta= new konto[10];
for(int i = 0;i < 10;i++)


 {
konta[i] = new konto();
konta[i].ID = i + 2;
 }



 while(w){
    System.out.println("Enter an id:");
    Scanner idscann = new Scanner(System.in);
    int idkonta = idscann.nextInt();
        if(idkonta > 10) {
          w= false;
          System.out.println("No id like this here");
          break;

}

System.out.println(+idkonta);

 while(e){

    System.out.println("Main menu ");
    System.out.println("1: Check balance");
    System.out.println("2: Witchdraw");
    System.out.println("3: Deposit ");
    System.out.println("4: Exit ");
    System.out.println("Enter a choise: ");

    Scanner wyborscann = new Scanner(System.in);
    int wybor = idscann.nextInt();

        switch(wybor){

          case 1:

                 System.out.println("Balance:");
                 System.out.println(konta[idkonta]. pieniądze);

          break;

          case 2:

                 System.out.println("How much you want to withdraw ?");
                 Scanner wartoscscann1 = new Scanner(System.in);
                 int wartosc1 = idscann.nextInt();
                 if(konta[idkonta]. pieniądze < wartosc1){
                     System.out.println("You're too poor xD");
                                                            }
                 else {
                    konta[idkonta]. pieniądze -= wartosc1;
                                                            }
          break;

          case 3:

                System.out.println("How much you want to deposit ?");
                Scanner wartoscscann2 = new Scanner(System.in);
                int wartosc2 = idscann.nextInt();
                konta[idkonta]. pieniądze += wartosc2;

           break;

           case 4:

                e = false;

           break;

           default:
                        System.out.println("Wrong command");

}
}
}
 }
}