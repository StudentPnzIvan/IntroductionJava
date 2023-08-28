package com.mycompany.app;

public class SelectionSort {

    // this version uses raw arrays instead of ArrayList
    public static void selectionSort(int[] target) {
        for (int i = 0; i < target.length - 1; i++) {
            int left = target[i];
            for (int j = i + 1; j < target.length; j++) {
                int right = target[j];
                if (left > right) {
                    target[i] = right;
                    target[j] = left;
                    left = right;
                }
            }
        }
    }
}