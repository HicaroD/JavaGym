package edu.javagym.algorithms.searching.linearsearch;

import java.util.ArrayList;

public class LinearSearch {
    public static <T> Integer search(ArrayList<T> collection, T target) {
        for (int i = 0; i < collection.size(); i++) {
            T currentValue = collection.get(i);
            if (currentValue.equals(target)) {
                return i;
            }
        }
        return null;
    }
}
