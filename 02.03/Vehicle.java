package com.company;

public class Vehicle {
String nazwa;
Engine engine;
Size size;
Color color;


public Vehicle(String nazwa, Engine engine, Size size, Color color) {
this.nazwa = nazwa;
    this.engine =  engine;
    this.size =  size;
    this.color = color;


}
    @Override
    public String  toString(){
        return "Vehicle{" +
                "name='" + nazwa + '\'' +
                ", engine='" + engine+ '\'' +
                ", size=" + size +
                ", color ='" + color +
                '}';
    }


}
