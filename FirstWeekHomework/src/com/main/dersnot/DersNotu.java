package com.main.dersnot;

public class DersNotu {
    public String dersNotuCount(double n) {
        if (n >= 3.5 && n <= 4) return "AA";
        else if (n >= 3 && n < 3.5) return "BA";
        else if (n >= 2 && n < 3) return "BC";
        else return "FF";
    }
}