package com.v11.cibertec.capitulo6;

public class Counter {
    static int x =0;
    public Counter(){
        x++;
    }
    void display(){
        System.out.println("valor de x =" + x);
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        new Counter();

        counter1.display();
        counter2.display();
        counter3.display();

    }
}
