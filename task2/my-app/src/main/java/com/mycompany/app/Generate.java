package com.mycompany.app;

import java.util.Arrays;
import java.util.Random;


public class Generate {

    public static void main(String[] args) {
        Generate.printSortsLists();
    }
    public static int[] generate(int value) {
        int[] arr = new int[value];
        Random rand = new Random();
        for (int i = 0; i < value; i++) {
            arr[i] = (rand.nextInt(100));
        }
        return arr;
    }

    public static void printSortsLists() {
        int[] arr;
        for (int i = 1; i < 10; i++) {
            arr = generate(i);
            System.out.println("Before random " + Arrays.toString(arr));
            SelectionSort.selectionSort(arr);
            System.out.println("After " + Arrays.toString(arr));
        }
    }
}