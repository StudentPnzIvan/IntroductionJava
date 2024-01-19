package edu.penzgtu.oop.task2;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("Enter length: ");
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNextDouble()) {
            throw new ArithmeticException("Type error");
        }
        System.out.println(getVolumeDod(scan.nextDouble()));
    }

    static double getVolumeDod(double i) {
        double value = (15 + 7*Math.sqrt(5)) / 4;
        return Math.pow(i, 3) * value;
    }
}


