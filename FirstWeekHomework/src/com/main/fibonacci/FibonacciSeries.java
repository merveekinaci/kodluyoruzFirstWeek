package com.main.fibonacci;

public class FibonacciSeries {
    public int fibonacciSeriesCount(int n) {
        if (n < 2) return n;
        else {
            return fibonacciSeriesCount(n - 1) + fibonacciSeriesCount(n - 2);
        }
    }
}
