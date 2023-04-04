package edu.javagym.algorithms.searching.binarysearch;

import java.util.ArrayList;

public class IterativeBinarySearch {
    public static Integer search(ArrayList<Integer> collection, int target) {
        Integer lower = 0;
        Integer higher = collection.size() - 1;

        while (lower <= higher) {
            Integer middle = lower + ((higher - lower) >> 1);
            Integer middleValue = collection.get(middle);

            if (middleValue.equals(target)) {
                return middle;
            } else if (target < middleValue) {
                higher = middle - 1;
            } else {
                lower = middle + 1;
            }
        }
        return null;
    }
}
