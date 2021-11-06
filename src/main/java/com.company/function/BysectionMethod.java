package com.company.function;

public class BysectionMethod {

    static double tolerance = 0.001;

    private static double func(double x){
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
    }
    // cos(x**5) + x**4 - 345.3 * x - 23 = 0
    // initial   a = 0    b = 10
    // f(a) = -22.0    f(b) = 6523.000639192562    tol = 0.001


    private static double bysectionMethod(double leftBorder, double rightBorder) {

        double result = (leftBorder + rightBorder) / 2;

        if (Math.abs(func(result)) <= tolerance) {
            return result;
        } else if (func(result) > 0) {
            return bysectionMethod(leftBorder, result);
        } else {
            return bysectionMethod(result, rightBorder);
        }
    }

    public static void main(String[] args) {
        System.out.println(bysectionMethod(0, 10));
    }
}
