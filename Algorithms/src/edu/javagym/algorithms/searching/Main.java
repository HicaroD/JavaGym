package edu.javagym.algorithms.searching;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import edu.javagym.algorithms.searching.binarysearch.IterativeBinarySearch;
import edu.javagym.algorithms.searching.binarysearch.RecursiveBinarySearch;
import edu.javagym.algorithms.searching.linearsearch.LinearSearch;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> collection = new ArrayList<>(
                List.of(1, 2, 3, 4, 5, 6, 8, 9, 10, 23, 25, 30));
        Integer target = 10;

        Integer index = LinearSearch.search(collection, target);

        if (index != null) {
            System.out.println(MessageFormat.format("{0} found at index {1}", target, index));
        }

        index = IterativeBinarySearch.search(collection, target);
        if (index != null) {
            System.out.println(MessageFormat.format("{0} found at index {1}", target, index));
        }

        index = RecursiveBinarySearch.search(collection, target, 0, collection.size() - 1);
        if (index != null) {
            System.out.println(MessageFormat.format("{0} found at index {1}", target, index));
        }
    }
}
