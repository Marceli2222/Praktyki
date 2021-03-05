
package com.company;

public class Cat extends Animal {


    private String makeSound;

    public String Voice() {
        return   name + " " + color +" " +makeSound  ;
    }


    public String getMakeSound(){

        return makeSound;
    }

    public void setMakeSound(String makeSound){
        this.makeSound = makeSound;
    }
}


