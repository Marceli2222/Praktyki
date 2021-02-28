package com.company;



public class P {
    private final int x;
    private final int y;



    public P() {
        this.x = 0;
        this.y = 0;
    }
    

    public P(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public double D(P P2) {
        double a = this.x - P2.getX();
        double b = this.y - P2.getY();
        return Math.sqrt(a + b);
    }


    public double o(int x2, int y2) {
        double a = this.x - x2;
        double b = this.y - y2;
        return Math.sqrt(a + b);
    }




    public int getX() {
        return x;
    }



    public int getY() {
        return y;
    }
}