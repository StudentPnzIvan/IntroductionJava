package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest 
{
    /**
     * Sorting test
     */
    @org.junit.jupiter.api.Test
    public void testSelSort()
    {
        int[] res = {};
        int[] exm = {};

        SelectionSort.selectionSort(res);
        assertArrayEquals(res, exm);

        res = new int[]{1};
        exm = new int[]{1};

        SelectionSort.selectionSort(res);
        assertArrayEquals(res, exm);

        res = new int[]{1, 3, 4};
        exm = new int[]{1, 3, 4};

        SelectionSort.selectionSort(res);
        assertArrayEquals(res, exm);

        res = new int[]{22, 12, 85, 98, 99, 33, 62, 18, 98};
        exm = new int[]{12, 18, 22, 33, 62, 85, 98, 98, 99};

        SelectionSort.selectionSort(res);
        assertArrayEquals(res, exm);


    }
}
