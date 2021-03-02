package com.company;

public class wiatrak {

public wiatrak(int a, boolean on, int radius,String color){


  final int slow = 1;
  final int medium = 2;
  final int fast = 3;
  int speed;


String opis =" speed: " + a + " radius: "+ radius + " color:" + color;

    if (a == 1){

      speed = slow;
      System.out.println("speed: "+ speed);

}

    if (a == 2){

      speed = medium;
      System.out.println("speed: "+ speed);

}

    if (a == 3){

      speed = fast;
      System.out.println("speed: "+ speed);

}

    if (on){

      System.out.println("wiatrak on" + opis);

}

    else{

       System.out.println("waitrak off" + opis);

 }
}

public wiatrak() {

final int slow = 1;
int speed = slow;
String color = "red";
int radius = 6;
boolean on = true;

   String opis =" speed: " + speed+ " radius: "+ radius + " color: " + color;

    if (on){

       System.out.println("wiatrak on" + opis);

        }
    }
}