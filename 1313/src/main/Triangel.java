package main;

public class Triangel {
    public static void main(String[] args) {


    }

    public static double geroneSquare(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


}
