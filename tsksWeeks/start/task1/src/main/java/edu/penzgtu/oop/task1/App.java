package edu.penzgtu.oop.task1;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Enter the user name: ");
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, " + scan.next() + "!");
    }
}
