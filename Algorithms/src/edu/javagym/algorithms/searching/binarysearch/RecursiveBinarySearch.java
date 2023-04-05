package edu.javagym.algorithms.searching.binarysearch;

import java.util.ArrayList;

public class RecursiveBinarySearch {
    public static Integer search(ArrayList<Integer> collection, int target, int lowerIndex, int higherIndex) {
        Integer middleIndex = lowerIndex + ((higherIndex - lowerIndex) >> 1);
        Integer middleValue = collection.get(middleIndex);

        if (lowerIndex > higherIndex) {
            return null;
        }

        if (middleValue.equals(target)) {
            return middleIndex;
        } else if (middleValue > target) {
            return search(collection, target, lowerIndex, middleIndex - 1);
        } else {
            return search(collection, target, middleIndex + 1, higherIndex);
        }
    }
}
