package com.main;

import com.main.dersnot.DersNotu;
import com.main.fibonacci.FibonacciSeries;
import com.main.manav.Manav;

public class Main {

    public static void main(String[] args) {

        //Fibonacci
        FibonacciSeries fibo = new FibonacciSeries();
        System.out.println("Fibonacci :");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibo.fibonacciSeriesCount(i) + " ");
        }
        System.out.println();

        //Ders Notu
        DersNotu ders = new DersNotu();
        System.out.println("Harf Notu :");
        System.out.print(ders.dersNotuCount(2.8));
        System.out.println();

        //Manav
        Manav manav = new Manav();
        System.out.println(manav.manavManager() + " TL");
    }
}
