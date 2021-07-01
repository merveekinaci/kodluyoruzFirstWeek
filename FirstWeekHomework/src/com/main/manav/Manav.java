package com.main.manav;

import java.util.Scanner;

public class Manav {

    public double manavManager() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        int armutkg = scanner.nextInt();
        System.out.print("Elma Kaç Kilo ? : ");
        int elmakg = scanner.nextInt();
        System.out.print("Domates Kaç Kilo ? : ");
        int domateskg = scanner.nextInt();
        System.out.print("Muz Kaç Kilo ? : ");
        int muzkg = scanner.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        int patlıcankg = scanner.nextInt();

        System.out.print("Manav ücretiniz : ");
        return manavPriceCounter(armutkg, elmakg, domateskg, muzkg, patlıcankg);
    }

    private static double manavPriceCounter(int armutkg, int elmakg, int domateskg,
                                    int muzkg, int patlıcankg) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5.00;

        return (armut * armutkg) + (elma * elmakg)
                + (domates * domateskg) + (muz * muzkg)
                + (patlıcan * patlıcankg);
    }

}
