package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x:");
        double x = in.nextDouble();
        System.out.println("Введите число y:");
        double y = in.nextDouble();
        try{
            System.out.println(Primer.getPrimer(x,y));
        }catch (PrimerException e){
            System.out.println(e.getMessage());
            System.out.println(e.getX());
        }
    }

    static class PrimerException extends Exception {

        private double x;
        public double getX() {
            return x;
        }

        public PrimerException(String message, double x){
            super(message);
            this.x = x;
        }
    }
    static class Primer{
        public static double getPrimer(double x, double y) throws PrimerException{
            if(y == -1) {
                throw new PrimerException("The number is ", y);
            }
            double Z = (x+y)/y+1;
            System.out.print("(x+y)/y+1 = ");
            return Z;
        }
    }
}
