package com.company;

public class TV {


    int chanel;
    int volume;
    int online;


    public TV(int chanel, int volume, int online) {
        this.online = online;

        if (online == 1) {
            System.out.println("tv jest włączone");
            this.chanel = chanel;
            System.out.println("kanał:" + chanel);
            this.volume = volume;
            System.out.println("głośność:" + volume);

        } else if (online == 0) {
            System.out.println("tv jest wyłączone");
        }


    }
}




