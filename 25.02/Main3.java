package com.company;

public class Main3 {

    public static void main(String[] args) {


    }
 public int[] s( int[] t1, int[] t2){



     if (t1.length != t2.length){
         return new int[0];
     }



 int[] o = new int [t1.length];
for (int i= 0; i < t1.length; i++){
o[i] = t1[i] + t2[i];

}
        return o; }
}
