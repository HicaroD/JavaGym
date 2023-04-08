package edu.javagym.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(List.of(3, 2, 1, 9, 0, -1, 15, 13));
        ArrayList<Integer> sortedArray = BubbleSort.sort(array);

        for (Integer element : sortedArray) {
            System.out.println(element);
        }
    }
}
