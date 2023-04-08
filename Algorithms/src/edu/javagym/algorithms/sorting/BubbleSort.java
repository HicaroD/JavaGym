package edu.javagym.algorithms.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {
                Integer previousElement = array.get(i);
                Integer nextElement = array.get(j);

                if (previousElement > nextElement) {
                    Collections.swap(array, j, i);
                }
            }
        }
        return array;
    }
}
